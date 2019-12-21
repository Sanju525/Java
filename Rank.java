import java.util.*;
class Rank{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
			//inRange(arr[i]);
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" "+inRange(arr[i]));
		}
	}
	static int inRange(int a){
		//System.out.print(a+" ");
		if(a>=0 && a<=35) return 5;
		else if(a>35 && a<=50) return 4;
		else if(a>50 && a<=65 ) return 3;
		else if(a>65 && a<=80)return 2;
		else if(a>80 && a<=100) return 1;
		else return -1;
	}
}
