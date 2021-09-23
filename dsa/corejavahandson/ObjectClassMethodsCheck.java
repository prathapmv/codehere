package codehere.dsa.corejavahandson;

public class ObjectClassMethodsCheck {

	// Overriding hashcode to have the custom hashcode when we print the above -
	// Compare the below result with the above
	static int hashCodeValue;

	ObjectClassMethodsCheck() {

	}

	ObjectClassMethodsCheck(int hashCodeValue) {
		hashCodeValue++;
	}

	public int hashCode() {
		return hashCodeValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClassMethodsCheck obj1 = new ObjectClassMethodsCheck();

		// toString() method check
		System.out.println(
				"Method toString() check: \n'Class Name of the Object' + '@' + 'hashCode' : " + obj1.toString());

		// Overriding hashCode() - Start
		hashCodeValue = 100;
		ObjectClassMethodsCheck obj2 = new ObjectClassMethodsCheck(hashCodeValue);
		System.out.println("\n\nOverriding hashCode() check: " + obj2.toString());
		// Overriding hashCode() - End
	}

}
