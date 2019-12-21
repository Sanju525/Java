import java.util.*;
class RmvReqNum{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int Num=input.nextInt();
		int Rm=input.nextInt();
		int low=Num-1;
		RmMeth(Rm,low);
	}
	static void RmMeth(int a,int num){
		int dup=num;
		int rem=0;
		int flag=0;
		//System.out.println(dup);
		//System.out.println();
		while(dup!=0){
			rem=dup%10;
			if(rem==a){
				//flag=flag+1;
				RmMeth(a,num-1);
				//break;
			}
			dup=dup/10;
			if(dup==0){
				PrintMeth(num);
				break;
			}
		}
	}
	static void PrintMeth(int a){
		System.out.println(a);
	}
}
