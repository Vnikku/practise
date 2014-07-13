package com.vnikku.practise.algo.tree;

public class Node<T> {

	private Node<T> left;
	private Node<T> right;

	private T value;

	public Node() {

	}

	public Node(T value) {
		this.value = value;
	}

	public Node<T> getLeft() {
		return left;
	}

	public Node<T> getRight() {
		return right;
	}

	public T getValue() {
		return value;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
