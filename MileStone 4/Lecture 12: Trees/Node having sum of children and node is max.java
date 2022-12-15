/*
Node having sum of children and node is max
Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1
*/
class Pair{
    TreeNode<Integer> t;
    int sum;
    Pair(TreeNode<Integer> t,int s){
        this.t=t;
        this.sum=s;
    }
}
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        Pair p=maxSum(root);
        return p.t;
        
	}
	public static Pair maxSum(TreeNode<Integer> root){
        if(root==null){
            return new Pair(null,0);
        }
        int sum1=root.data;
        for(int i=0;i<root.children.size();i++){
            sum1+=root.children.get(i).data;
        }
        TreeNode<Integer> t=root;
    	int sum=sum1;
        for(int i=0;i<root.children.size();i++){
            Pair pc=maxSum(root.children.get(i));
            if(pc.sum > sum){
                sum=pc.sum;
                t=pc.t;
            }
        }
        return new Pair(t,sum);
    }
	
		
}
