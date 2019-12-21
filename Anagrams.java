//str.replaceAll(des char,req char){replaceAll(" ","")}
//toLowerCase();convets all upper case to lower
//char ch[]=str.toCharArray();
//sorting Arrays.sort(ch);
//Arrays.equals(arr1,arr2);
import java.util.*;
class Anagrams{
	public static void main(String args[]){
		String s1,s2;
		Scanner input=new Scanner(System.in);
		s1=input.nextLine();
		s2=input.nextLine();
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ","");
		if(s1.length()!=s2.length()){
			System.out.println(s1+" & "+s2 +" are not Anagrams");
		}
		else{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)){
				System.out.println(s1+" & "+s2+" are Anagrams");
			}
			else System.out.println(s1+" & "+s2+" are not Anagrams");
		}


	}
}
