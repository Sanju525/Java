import java.util.*;
class EliDup{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("ENter a size");
		n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Eliminating Duplicates");
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;){
				if(arr[i]==arr[j]){
					for(int k=j;k<n;k++){
						arr[k]=arr[k+1];
					}
					n--;
				}
				else{
					j++;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
