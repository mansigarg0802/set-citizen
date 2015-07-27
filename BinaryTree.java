import java.util.Scanner;
public class BinaryTree
{
 public static class TreeNode
 {
  int data;
  TreeNode left;
  TreeNode right;
  TreeNode(int data)
  {
   this.data=data;
  }
 }
 public static  int getLeafCountOfBinaryTree(TreeNode node)
{
  if(node == null)      
    return 0;
  if(node.left ==null && node.right==null)     
    return 1;           
  else
    return getLeafCountOfBinaryTree(node.left)+ getLeafCountOfBinaryTree(node.right);     
}

public static void main(String args[] ) throws Exception
{
  BinaryTree bi=new BinaryTree();
  TreeNode rootNode=createBinaryTree();
  System.out.println("Number of leaf nodes in binary tree :"+getLeafCountOfBinaryTree(rootNode));

Scanner sc = new Scanner(System.in);
int test = sc.nextInt();int ppl;
for(int i=0; i<test; i++)
{
ppl=sc.nextInt();
int arr[]=new int[(ppl-1)*2];
for(int j=0;j<(ppl-1)*2;j=j+2)
{
arr[j]=sc.nextInt();
arr[j+1]=sc.nextInt();
}
}
}
 public static TreeNode createBinaryTree()
 {
TreeNode rootNode =new TreeNode(0);
  TreeNode node1=new TreeNode(1);
  TreeNode node2=new TreeNode(2);
  TreeNode node3=new TreeNode(3);
  
  rootNode.left=node1;
  rootNode.right=node2;
  
  node2.left=node3;
  return rootNode;
  }
}
