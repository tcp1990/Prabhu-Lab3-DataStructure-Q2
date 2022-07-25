package com.gl.services;

import java.util.List;
import java.util.Stack;

import com.gl.model.Node;

public class SumOfPairInBinarySearchTree {

	private boolean findpair(Node root, int sum, List<Integer> set) {
		if (root == null)
			return false;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is found (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else
			set.add(root.data);

		if (findpair(root.left, sum, set))
			return true;
		return findpair(root.right, sum, set);
	}

	public void printSumOfPair(Node root, int sum) {
		List<Integer> set = new Stack<Integer>();
		if (!findpair(root, sum, set))
			System.out.println("Pairs do not exit");
	}

}
