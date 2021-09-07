package com.bridgelabz.emailvalidation;

public class EmailValidation {

	public static boolean emailValidator(String email) {

		return email.matches("(abc(.*)+(?<!\\.)@(.*))+(?<!\\.)$");
	}

	public static void main(String[] args) {

		String[] testCases = {
				"abc.xyz@bridgelabz.co.in",
				"abc@yahoo.com,",
				"abc-100@yahoo.com,",
				"abc.100@yahoo.com",
				"abc111@abc.com,",
				"abc-100@abc.net,",
				"abc.100@abc.com.au",
				"abc@1.com,",
				"abc@gmail.com.com",
				"abc+100@gmail.com",

				"abc",
				"abc@.com.my",
				"abc123@gmail.a",
				"abc123@.com",
				"abc123@.com.com",
				".abc@abc.com",
				"abc()*@gmail.com",
				"abc@%*.com",
				"abc..2002@gmail.com",
				"abc.@gmail.com",
				"abc@abc@gmail.com",
				"abc@gmail.com.1a",
				"abc@gmail.com.aa.au"
		}; 

		for(int index = 0;index < testCases.length;index++) {
			String email = testCases[index];
			boolean result = emailValidator(email);
			if(result == true) {
				System.out.println(testCases[index]+" : Valid Email!");
				System.out.println();
			}
			else {
				System.out.println(testCases[index]+" : Invalid Email!");
				System.out.println();
			}
		}
	}
}
