package PracticeProjectPackage;

import java.io.*;

public class PracticeClass {
	
	private class Node {
		
		int value;
		Node next;
		
		public Node (int val, Node n) {
			value = val;
			next = n;
		}
		
		public Node (int val) {
			value = val;
			next = null;
		}
	}
	
	private Node first = null;
	
	public PracticeClass () {
		first = new Node(2);
		first.next = new Node(3);
		first.next.next = new Node(4);
		first = new Node(1, first);
		int[] nums = {0, -1};
		for (int n : nums) {
			first = new Node(n, first);
		}
	}
	
	public void print() {
		Node ref = first;
		while (ref != null) {
			System.out.print(ref.value + " ");
			ref = ref.next;
		}
	}
	
	public void add(int v) {
		Node ref = first;
		while (ref.next != null) {
			ref = ref.next;
		}
		ref.next = new Node(v);
	}
	
	public void add(int v, int location) {
		
	}

	
    public static void main(String [] args)
    {
       PracticeClass pc = new PracticeClass();
       pc.print();
       System.out.println();
       
       pc.add(5);
       pc.add(6);
       pc.print();
    }

}
