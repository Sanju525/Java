import java.util.*;
class UntlPalindrome{
	static boolean CheckFun(int n){//palindrome check
		int a=n;
		int b= NumRev(a);
		if(a==b){
			System.out.println("Palindrome is "+a);
		}
		else{
			System.out.println(a+ "\t" +b);
		}
		return a!=b;
	}
	static int NumRev(int a){//reverse of int
		int rem=0,rev=0;
		while(a>0){
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev;
	}
	static int add(int a,int b){ //addition of int and reverse of int
		return a+b;
	}
	public static void main(String args[]){ //main method
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		//reverse
		//int sum=add(int a,int b);//Adding with return type
		//create static method of sum,concat,compare(return s1,s2)
		while(CheckFun(n)){
			int sum=add(n,NumRev(n));
			n=sum;
		}
	}
}
