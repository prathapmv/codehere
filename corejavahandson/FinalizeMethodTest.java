package corejavahandson;

//Java program to demonstrate working of finalize()
public class FinalizeMethodTest {
    public static void main(String[] args) {
        FinalizeMethodTest t = new FinalizeMethodTest();
        System.out.println("Hashcode: " + t.hashCode());

        t = null;

        // calling garbage collector
        System.gc();

        System.out.println("end");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}