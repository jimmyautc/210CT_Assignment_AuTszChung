/*
	course:210ct
	Name:AuTszChung
	Program:TestTree.java
	Description: Test Program of Test the Binary search Tree with delete finction 
*/
class TestTree{
	public static void main(String []args){
		//new BinarySearchTree object
		BinarySearchTree tree = new BinarySearchTree(); 
		int [] num={2,7,9,4,1,5,3,6,0,8}; 
		for(int i=0;i<num.length;i++){
		tree.insert(i);
		}
		//delete the node of tree
		tree.delete(8);
		//print the tree
		tree.inorder();
	}
}