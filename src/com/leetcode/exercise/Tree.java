package com.leetcode.exercise;

class Node{
	public int Key;
	public String name;
	Node left;
	Node right;
	Node(int Key, String name){
		this.Key = Key;
		this.name = name;
	}
	public String toString(){
		return name + "has a Key " + Key;
	}
}

public class Tree {
	Node root;
	public void addNode(int Key, String name){
		Node newNode = new Node(Key, name);
		if(root == null){
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if( Key < focusNode.Key){
					focusNode = focusNode.left;
					if(focusNode == null){
						parent.left = newNode;
						return;
					}
				}else{
					focusNode = focusNode.right;
					if(focusNode == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.left);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.right);
		}
	}
	
	public boolean remove(int key){
		Node focusNode = root;
		Node parent = root;
		return true;
	}
	
	public void preOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.left);
			
			inOrderTraverseTree(focusNode.right);
		}
	}
	
	public void postOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			
			inOrderTraverseTree(focusNode.left);
			
			inOrderTraverseTree(focusNode.right);
			
			System.out.println(focusNode);
		}
	}
	
	public Node findBode(int key){
		Node focusNode = root;
		while(focusNode.Key != key){
			if(key < focusNode.Key){
				focusNode = focusNode.left;
			}else{
				focusNode = focusNode.right;
			}
			
			if(focusNode == null){
				return null;
			}
		}
		
		return focusNode;
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.addNode(50, "");
		tree.addNode(25, "");
		tree.addNode(15, "");
		tree.addNode(30, "");
		tree.addNode(75, "");
		tree.addNode(85, "");
		
		tree.inOrderTraverseTree(tree.root);
	}
	
}
