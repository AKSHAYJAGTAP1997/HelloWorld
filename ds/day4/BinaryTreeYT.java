public class BinaryTreeYT
{
	static class Node
	{
       int data; 
        Node left;  
       Node right;
	   Node(int d)
	   {
		   data=d;
		   left=null;
		   right=null;
		   
		   
	   }

		
	}
	
	static class BinaryTree
	{
		static int idx=-1;
		public static Node BuildTree(int nodes[])
		{
			idx++;
			if(nodes[idx]==-1)
			{
				return null;
			}
			
			Node newnode=new Node(nodes[idx]);
			newnode.left=BuildTree(nodes);
			newnode.right=BuildTree(nodes);
			return newnode;
			
		}
		
		//return newnode;
		
	}
	
	
	public static void main(String[] args)
	{
		int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.BuildTree(nodes);
		System.out.println(root.data);
		
		
	}
	
	
}