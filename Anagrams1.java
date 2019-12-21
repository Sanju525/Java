//prerequisites
//split.....
import java.util.*;
class Anagrams1{
static void  Anagrams(String s1,String s2){
        //public static void main(String args[]){
                //String s1,s2;
                //Scanner input=new Scanner(System.in);
                //s1=input.nextLine();
                //s2=input.nextLine();
                //s1=s1.replaceAll(" ","");
                //s2=s2.replaceAll(" ","");
                if(s1.length()!=s2.length()){
                        //System.out.println(s1+" & "+s2 +" are not Anagrams");
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
                        //else System.out.println(s1+" & "+s2+" are not Anagrams");
                }


        }
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string arr");
		String s=input.nextLine();
		String w[]=s.split(" ");
		for(int i=0;i<w.length;i++){
			for(int j=i+1;j<w.length;j++){
				Anagrams(w[i],w[j]);
			}
		}
	}
}

