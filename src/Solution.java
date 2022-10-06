
public class Solution {
	public void m1(int i, float f) {
		System.out.println(" inside m1 method");
	}

	public void m(float f, int i) {
		System.out.println(" inside m2 method");
	}

	public static void main(String[] args) {
		Solution test = new Solution();
		test.m1(20, 20);
	}
}
