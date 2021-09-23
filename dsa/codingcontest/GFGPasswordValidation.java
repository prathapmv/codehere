package codehere.dsa.codingcontest;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFGPasswordValidation {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of test cases:");
		int testCaseNo = sc.nextInt();

		String[] password = new String[20];
		System.out.println("Enter the passwords:");
		for (int i = 0; i < testCaseNo; i++) {
			password[i] = sc.nextLine();
		}

		for (int i = 1; i < password.length; i++) {
			String passwordValidate = password[i];
			passwordValidate = passwordValidation(passwordValidate);
			System.out.println(passwordValidate);
		}
	}

	static String passwordValidation(String passwordToCheck) {
		String passwordCheck = "";

		char[] passwordChar = passwordToCheck.toCharArray();

		for (int i = 0; i < passwordChar.length; i++) {
			// Upper Case Check
			if (Character.isUpperCase(passwordChar[i]) || Character.isLowerCase(passwordChar[i])
					|| Character.isDigit(passwordChar[i])) {
				passwordCheck = "YES";
			} else {
				passwordCheck = "NO";
			}

		}
		return passwordCheck;
	}
}
