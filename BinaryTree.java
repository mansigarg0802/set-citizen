import java.util.Scanner;
public class BinaryTree
{
 public static class TreeNode
 {
  int data;
  TreeNode n1;
  TreeNode n2;
TreeNode n3;
  TreeNode n4;
  TreeNode n5;
  
  TreeNode(int data)
  {
   this.data=data;
  }
 }
 public static  int getLeafCountOfBinaryTree(TreeNode node)
{
  if(node == null)      
    return 0;
  if(node.n1 ==null && node.n2==null&& node.n3==null&& node.n4==null&& node.n5==null)     
    return 1;           
  else
    return getLeafCountOfBinaryTree(node.n1)+ getLeafCountOfBinaryTree(node.n2)+getLeafCountOfBinaryTree(node.n3)+getLeafCountOfBinaryTree(node.n4)+getLeafCountOfBinaryTree(node.n5);     
}

public static void main(String args[] ) throws Exception
{
  BinaryTree bi=new BinaryTree();
  TreeNode rootNode=createBinaryTree();
  System.out.println("Number of leaf nodes in binary tree :"+getLeafCountOfBinaryTree(rootNode));

Scanner sc = new Scanner(System.in);
int test = sc.nextInt();int ppl;int sib=0,allowed=0;
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
  TreeNode node4=new TreeNode(4);
  TreeNode node5=new TreeNode(5);
  TreeNode node6=new TreeNode(6);
  TreeNode node7=new TreeNode(7);
  TreeNode node8=new TreeNode(8);
 
  rootNode.n1=node1;
  rootNode.n2=node2;
  
  node2.n1=node3;node2.n2=node4;node2.n3=node5;
node3.n1=node6;node3.n2=node7;node4.n1=node8;
  return rootNode;
  }
}
