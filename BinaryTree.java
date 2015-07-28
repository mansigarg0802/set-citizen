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
printLevelOrder(rnode);
}

}
 public static TreeNode createBinaryTree(int[] arr)
 {
int ppl=(arr.length/2)+1;

TreeNode node[]=new TreeNode[ppl];
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
public static int heightOfBinaryTree(TreeNode node)
{
    if (node == null)
    {
        return 0;
    }
    else
    {
        return 1 +
        Math.max(heightOfBinaryTree(node.n[0]),
            heightOfBinaryTree(node.n[1]));
    }
}
public static void printLevelOrder(TreeNode root)
{
    int h = heightOfBinaryTree(root);    int i,odd=0,even=0,ans;
 for (i=1; i<=h; i=i+2)
    {
       odd=odd+printGivenLevel(root, i);
        
    }
    for (i=2; i<=h; i=i+2)
    {
        even=even+printGivenLevel(root, i);
      
    }
 ans=Math.max(odd,even);
System.out.println(ans);
}
 
public static int printGivenLevel(TreeNode root, int level)
{int num1=0,num2=0;
    if (root==null)
        return 0;
    if (level == 1)
       return 1;
    else if (level > 1)
    {
       num1=num1+printGivenLevel(root.n[0], level-1);
        num2=num2+printGivenLevel(root.n[1], level-1);
    }
return num1+num2;
}



}


