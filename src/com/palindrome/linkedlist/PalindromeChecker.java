package com.palindrome.linkedlist;

public class PalindromeChecker {
	public static boolean isPalindrome(String value) {
		// convert lower case
		// remove the special char with number
		// check right and left charters 
		// return result have boolean
		
		value = value.toLowerCase();
		value = value.replaceAll("[^a-zA-Z0-9]", "");
		
		int left =0;
		int right = value.length() - 1;
		
		while (left < right) {
			
			//Checking left and right charters
			if(value.charAt(left) != value.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
		}
		
		public static void main(String arg[]) {
			String value = "madudam";
			System.out.println("[" + value + "] - Given value is Palindrome : " + isPalindrome(value)); 
		}
}
