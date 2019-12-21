import java.util.*;
class ExepHand{
	static void tRy(int n){
		int a=42;
		int d=a/n;
		System.out.println(d);
	//return 0;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		try{
			tRy(n);
		}
		catch(ArithmeticException e){
			System.out.println("division by "+n +" is not Possible.");
		}
		System.out.println("After Catch statement");
	}
}
