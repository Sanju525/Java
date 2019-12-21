import java.util.Scanner;
class ReqNumArr{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=input.nextInt();
		int arr[]=new int[n];
		int flag=0;
		int req;
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the required Num: ");
		req=input.nextInt();
		for(int i=0;i<n-1;i++){
			int sum=0;
			for(int j=i+1;j<n;j++){
				sum=sum+(arr[i]+arr[j]);
				if(sum==req){
					//System.out.print("{"+arr[i]);
					PrintFun(i,j);
					flag=flag+1;
				}
			}
		}
		if(flag==0){
			System.out.println("No SubArray Found");
		}
	}
	static void PrintFun(int a,int b){
		ReqNumArr obj=new ReqNumArr();
		for(int i=a;i<=b;i++){
			System.out.print("{"+obj.arr[i]+" ");
		}
		System.out.println("}");
	}
}
