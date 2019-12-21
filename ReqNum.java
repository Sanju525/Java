import java.util.*;
class ReqNum{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=input.nextInt();
		System.out.println("Enter Array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the num");
		int req=input.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i;j<n;j++){
				if(arr[i]+arr[j]==req){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
