import java.util.*;
class RigthZero{
	public static void main(String args[]){
		int arr[]={19,24,0,18,0,26,0};
		//int len=arr.length();
		//int brr[]=new int[n];
		int c=6;//c=0
		for(int i=6;i>-1;i--){//for(int i=0;i<7;i++)
			if(arr[i]!=0){
				arr[c]=arr[i];
				c=c-1;
			}
		}
		while(c>-1){
			arr[c]=0;
			c--;
		}
		for(int i=0;i<7;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
