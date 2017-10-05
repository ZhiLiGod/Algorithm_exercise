package com.leetcode.exercise;

class Node{
	public int Key;//key
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
		if(root == null){//the first node is the root
			root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if( Key < focusNode.Key){//new node less than current node, put left side
					focusNode = focusNode.left;
					if(focusNode == null){
						parent.left = newNode;
						return;
					}
				}else{//new node greater than current node, put right side
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
		 boolean isLeftChind = true;
		 while(focusNode.Key != key){
			 parent = focusNode;
			 if(key < focusNode.Key){
				 focusNode = parent.left;
				 isLeftChind = true;
			 }else{
				 focusNode = focusNode.right;
				 isLeftChind = false;
			 }
			 
			 if(focusNode == null){
				 return false;
			 }
		 }
		 	
		 if(focusNode.left == null && focusNode.right == null){//leaf
			 if(focusNode == root){//just a root
				 root = null;
			 }else if(isLeftChind){
				 parent.left = null;
			 }else{
				 parent.right = null;
			 }
		 }
		 
		 else if(focusNode.right == null){
			 if(focusNode == root){
				 root = focusNode.left;
			 }else if(isLeftChind){
				 parent.left = focusNode.right;
			 }else{
				 parent.right = focusNode.left;
			 }
		 }
		 
		 else if(focusNode.left == null){
			 if(focusNode == root){
				 root = focusNode.right;
			 }else if(isLeftChind){
				 parent.left = focusNode.right;
			 }else{
				 parent.right = focusNode.left;
			 }
		 }
		 
		 else{
			 Node replacement = getReplacementNode(focusNode);
			 
			 if(focusNode == root){
				 root = replacement;
			 }else if(isLeftChind){
				 parent.left = replacement;
			 }else{
				 parent.right = replacement;
			 }
			 replacement.left = focusNode.left;
		 }
		 
		 return true;
		 
	}
	
	public Node getReplacementNode(Node focusNode) {
		Node replacementParent = focusNode;
		Node replacement = focusNode;
		
		Node focusNode_ = focusNode.right;
		while(focusNode_ != null){
			replacementParent = replacement;
			replacement  =focusNode_;
			focusNode_ = focusNode_.left;
		}
		
		if(replacement != focusNode.right){
			replacementParent.left = replacement.right;
			replacement.right = focusNode.right;
		}
		
		return replacement;
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
		
		//tree.inOrderTraverseTree(tree.root);
		tree.remove(25);
		System.out.println("------------------------------");
		tree.inOrderTraverseTree(tree.root);
	}
	
}
