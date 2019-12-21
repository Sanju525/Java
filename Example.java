import java.util.Scanner;
import java.util.Arrays;
class Example{
	//int arDgt[]=new int[5];
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int req=10,reqi=1;
		//int j=0;
		int count=0;
		for(int j=0;j<n;j++){
			if(arr[j]<req){
				count=count+1;
			}
			else{
				System.out.println(reqi+" "+count);
				count=1;
				req=req*10;
				reqi=reqi+1;
			}
			//j=j+1;
		}
		System.out.println(reqi+ " " +count);
	}
}

