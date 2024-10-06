package com.palindrome.linkedlist;

public class PalindromeOfLinkedList {

	public static void main(String[] args) {
		
		PalindromeOfLinkedList llp = new PalindromeOfLinkedList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		
		boolean result = llp.isPalindrome(head);
	    System.out.println("Is the linked list a palindrome? " + result);
	}

	private boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		// Step 1: Find the middle of the linked list
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		// Step 2: Reverse the second half of the linked list
		ListNode secondHalfNode = reverseList(slow);
		ListNode firstHalfNode = head;
		
		
		// Step 3: Compare the first half with the reversed second half
		while(secondHalfNode != null) {
			if(firstHalfNode.val != secondHalfNode.val ) {
				return false;
			}
			firstHalfNode = firstHalfNode.next;
			secondHalfNode = secondHalfNode.next;
		}
		
		
		return true;
	}

	private ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		
		while(current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev= current;
			current = next;
		}
		return prev;
	}

}
