package com.gl.apps;

import com.gl.model.Node;
import com.gl.services.SumOfPairInBinarySearchTree;

public class Main {

	public static void main(String[] args) {

		Node root = new Node(40);
		root.left = new Node(20);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right = new Node(60);
		root.right.right = new Node(70);
		root.right.left = new Node(50);
		
		int sum = 130;
		System.out.println("Sum = " + sum);

		SumOfPairInBinarySearchTree sumOfPair = new SumOfPairInBinarySearchTree();
		sumOfPair.printSumOfPair(root, sum);
	}
}
