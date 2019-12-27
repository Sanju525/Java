import java.util.Scanner; //Input function includes.

class Scanning
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num=input.nextInt();   //This cmd will consider the input from the user.
        //int num=input.nextByte();
        //int num=input.nextDouble();
        //int num=input.nextFloat();
        // to print concatenated strings
        // println("i am" + "Sanjay"); -> Ouuput is i am Sanjay
        // for any char specify with in '  '  .
        System.out.println("Entered number is " + num);

    }

}
