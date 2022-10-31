/*
Factors
Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Sample Input 2 :
11
Sample Output 2 :



Explanation of Sample Output 2 :
No output as 11 is prime having factors as 1 and 11 only
*/
import java.util.Scanner;
class Solution{
public static void main (String args[]){
    Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
       int i=2;
        while(i<n){
           
          //i=2;
        if(n%i==0){
            System.out.print(i+" ");
           
        }
        i++;
        }
        
}
}
