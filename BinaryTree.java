import java.util.Scanner;
public class BinaryTree
{
 public static class TreeNode
 {
  int data;
  TreeNode n[]=new TreeNode[5];
  
  TreeNode(int data)
  {
   this.data=data;
  }
 }
 public static  int getLeafCountOfBinaryTree(TreeNode node)
{
  if(node == null)      
    return 0;
  if(node.n[0] ==null && node.n[1]==null&& node.n[2]==null&& node.n[3]==null&& node.n[4]==null)     
    return 1;           
  else
    return getLeafCountOfBinaryTree(node.n[0])+ getLeafCountOfBinaryTree(node.n[1])+getLeafCountOfBinaryTree(node.n[2])+getLeafCountOfBinaryTree(node.n[3])+getLeafCountOfBinaryTree(node.n[4]);     
}

public static void main(String args[] ) throws Exception
{

Scanner sc = new Scanner(System.in);
int test = sc.nextInt();int ppl;
for(int i=0; i<test; i++)
{
  BinaryTree bi=new BinaryTree();
  
ppl=sc.nextInt();
int arr[]=new int[(ppl-1)*2];
for(int j=0;j<(ppl-1)*2;j=j+2)
{
arr[j]=sc.nextInt();
arr[j+1]=sc.nextInt();
}
TreeNode rnode=createBinaryTree(arr);
  System.out.println("Number of leaf nodes in binary tree :"+getLeafCountOfBinaryTree(rnode));

}

}
 public static TreeNode createBinaryTree(int[] arr)
 {
int ppl=(arr.length/2)+1;
System.out.println(ppl);
TreeNode node[]=new TreeNode[ppl];
System.out.println(node.length);
for(int p=0;p<ppl;p++)
{
node[p]=new TreeNode(p);
}
int x=0;
for(int num=0;num<ppl;num++)
{
for(int i=1;i<arr.length;i=i+2)
{
if(arr[i]==num)
{
node[num].n[x]=node[arr[i-1]];
x=x+1;  
}
}
x=0;
}
  return node[0];
  }
}
