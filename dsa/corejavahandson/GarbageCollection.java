package codehere.dsa.corejavahandson;

public class GarbageCollection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		GarbageCollection t1 = new GarbageCollection();
		GarbageCollection t2 = m1(t1); // line 6
		GarbageCollection t3 = new GarbageCollection();
		t2 = t3; // line 8
		System.out.println(t1.hashCode() + " -- " + t2.hashCode() + " -- " + t3.hashCode());
		System.gc();
	}

	static GarbageCollection m1(GarbageCollection temp) {
		temp = new GarbageCollection();
		return temp;
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called: " + this.hashCode());
	}

}
