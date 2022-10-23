/*Print Keypad Combinations Code
Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/
public class solution {
    
    
     public static char [] helper(int n)
    {
        if(n==2)
        {
            char a[]={'a','b','c'};
            return a;
        }
        if(n==3)
        {
            char a[]={'d','e','f'};
            return a;
        }
        if(n==4)
        {
            char a[]={'g','h','i'};
            return a;
        }
        if(n==5)
        {
            char a[]={'j','k','l'};
            return a;
        }
        if(n==6)
        {
            char a[]={'m','n','o'};
            return a;
        }
        if(n==7)
        {
            char a[]={'p','q','r','s'};
            return a;
        }
        if(n==8)
        {
            char a[]={'t','u','v'};
            return a;
        }
        if(n==9)
        {
            char a[]={'w','x','y','z'};
            return a;
        }
        char a[]={'a'};
        return a;
    }
    
    public static void printKeypad(int n, String ans){
		if(n==0)
        {
            System.out.println(ans);
            return;
        }
        char a[]=helper(n%10);
        for(int i=0;i<a.length;i++)
        {
            printKeypad(n/10,a[i]+ans);
        }
		
	}

	public static void printKeypad(int input){
		printKeypad(input,"");
		
	}
}
