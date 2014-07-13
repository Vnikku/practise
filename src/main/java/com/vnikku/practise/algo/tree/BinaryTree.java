package com.vnikku.practise.algo.tree;

public class BinaryTree<T> implements Tree {

	private Node<T> root;

	public BinaryTree() {
	}

	public BinaryTree(Node<T> root) {
		this.root = root;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

}
