//****Popular Question ********

//Given N Ropes and their lengths. Tie all the ropes into a single rope
//Cost -> Ai+Aj
//newLength -> A++Aj
//Goal is to minimize the cost of tieing all the roeps

//Idea is to pick smallest 2 and then add them up

//1. Convert to Min Heap
//2. x = getMinFromHeap(A);
//3. deleteRoot();
//4. y = getMinFromHeap(A);
//5. deleteRoot();
//6. cost += x+y;
//7. A.ins(x+y);
package com.heaps;

public class NRopes {
    public static void main(String args[]){
        int arr[]={5,17,100,11};
        int n = arr.length;
    }
}
