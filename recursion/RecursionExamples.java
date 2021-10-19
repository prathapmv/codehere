package recursion;

public class RecursionExamples {

	public String stringReverse(String input) {
		// base cases
		if (input.equals("")) // if the input string is null/empty
			return input;
		return stringReverse(input.substring(1)) + input.charAt(0);
	}

	private boolean palindromeCheck(String palindromeStr) {
		// TODO Auto-generated method stub
		// base case - if the string is of size 0 or 1 then we can consider it as a
		// palindrome
		if (palindromeStr.length() == 0 || palindromeStr.length() == 1)
			return true;

		if (palindromeStr.charAt(0) == palindromeStr.charAt(palindromeStr.length() - 1))
			return palindromeCheck(palindromeStr.substring(1, palindromeStr.length() - 1));

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExamples recursionObj = new RecursionExamples();

		// Palindrome check for a given string - Start
		String palindromeStr = "heleh";
		boolean isPalindrome = false;
		isPalindrome = recursionObj.palindromeCheck(palindromeStr);
		if (isPalindrome)
			System.out.println("Yes, it is a palindrome string!");
		else
			System.out.println("No, it is not a palindrome string!");
		// Palindrome check for a given string - End

		// Reversing a String - Start
		String str = "the simple engineer";
		System.out.println("Input String: " + str);
		str = recursionObj.stringReverse(str);
		System.out.println("Reversed String: " + str);
		// Reversing a String - End

	}

}
