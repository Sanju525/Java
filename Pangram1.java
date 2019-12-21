import java.util.*;
class Pangram1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		String sTr="the quick brown fox jumps over a lazy dog";
		//String s="cbaa";
		//String s1="a";
		//System.out.println(s.indexOf(s1));STDOUT=2
		String temp="";
		for(char i='a';i<='z';i++){
			if(sTr.indexOf(i)!=-1){
				temp=temp+i;
			}
		}
		//System.out.println(temp+" "+temp.length());
		if(temp.length()==26) System.out.println("Pangram");
		else System.out.println("Not Pangram");
	}
}
