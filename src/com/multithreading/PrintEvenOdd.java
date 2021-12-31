package com.multithreading;

public class PrintEvenOdd {

	public static void main(String[] args) {
		PrintNumbers printNums = new PrintNumbers(20);// Shared object for both the threads
		OddThread o = new OddThread(printNums);
		EvenThread e = new EvenThread(printNums);
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(e);
		t1.start();
		t2.start();
	}

}

class PrintNumbers {
	int num;
	boolean flag;
	int limit;//Limit is set to 20 i.e. print first 20 numbers

	PrintNumbers(int limit) {
		this.limit = limit;
	}

	// Job of Thread1
	public void printEven() throws InterruptedException {
		synchronized (this) {
			while (num < limit - 1)// num starts from 0 therefore till limit-1
			{
				if (!flag)
					wait();
				this.num = this.num + 1;
				System.out.println(this.num);
				this.flag = false;
				notify();
			}
		}
	}

	// Job of Thread2
	public void printOdd() throws InterruptedException {
		synchronized (this) {
			while (num < limit - 1) {
				if (flag)
					wait();
				this.num = this.num + 1;
				System.out.println(this.num);
				this.flag = true;
				notify();
			}
		}
	}
}

// Thread1
class OddThread implements Runnable {
	PrintNumbers printNums;

	OddThread(PrintNumbers printNums) {
		this.printNums = printNums;
	}

	@Override
	public void run() {
		try {
			printNums.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// Thread2
class EvenThread implements Runnable {
	PrintNumbers printNums;

	EvenThread(PrintNumbers printNums) {
		this.printNums = printNums;
	}

	@Override
	public void run() {
		try {
			printNums.printEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
