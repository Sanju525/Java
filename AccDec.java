import java.util.*;
class AccDec{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n;//size 
		n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		for(int i=0;i<(n/2)-1;i++){//First half elements
			for(int j=i+1;j<=(n/2)-1;j++){
				int temp;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=n/2;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int temp;
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements after AccDec");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
