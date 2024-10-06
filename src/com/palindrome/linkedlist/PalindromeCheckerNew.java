package com.palindrome.linkedlist;

public class PalindromeCheckerNew {
	public static void main(String[] args) {
		// Test cases
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isPalindrome("No 'x' in Nixon")); // true
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // true
        System.out.println(isPalindrome("Hello, World!")); // false
        System.out.println(isPalindrome("Madam In Eden, I'm Adam")); // true
        System.out.println(isPalindrome("Step on no pets")); // true
	}

	public static boolean isPalindrome(String str) {
		str = normalizeString(str);
		int left = 0;
		int right = str.length() -1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	private static String normalizeString(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (char ch : str.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return sb.toString();
	}

}
