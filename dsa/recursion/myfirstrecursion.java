package codehere.dsa.recursion;

class FirstRecursion {
	public int recurSum(int a) {
		if (a == 10) {
			return a;
		}
		return recurSum(1 + a);
	}

	public Object stackOverflowRecusrion() {
		return stackOverflowRecusrion();
	}
}

public class myfirstrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRecursion recurObj = new FirstRecursion();
		int sum = recurObj.recurSum(0);
		System.out.println("Recursive sum: " + sum);
		recurObj.stackOverflowRecusrion();
	}

}
