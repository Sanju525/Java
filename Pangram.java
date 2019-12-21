
import java.util.*;
class Pangram{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		String sTr=input.nextLine();
		sTr=sTr.replace([a-z],"");
		if(sTr.length==0) System.out.println("PanGram");
		else System.out.println("Not panGram");
	}
}
