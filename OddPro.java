import java.util.*;
class OddPro{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
			if(arr[i]%2==1){
				OddFun(arr[i]);
			}
		}
	}
	static void OddFun(int a){
		int rem=1,pro=1;
		//rem=a%10;
		while(a!=0){
			rem=a%10;
			pro=pro*rem;
			a=a/10;
		}
		System.out.println(pro);
	}
}
