import java.util.Scanner; // included scanner for scanning the input from the user

class IfElseStatements {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // calling scanner function
        System.out.println("Enter an Integer");
        int num1=input.nextInt(); // scanning the input given by user by declaring
        if(num1>0) // giving the 1st condition
        {
            System.out.println("The entered integer is positive");
        }
        else if(num1<0) // giving the 2nd condition
        {
            System.out.println("The entered integer is negative");
        }
        else //Final func if all the above cases were failed
        {
            System.out.println("The entered integer is '0' ");
        }

    }
}
// Nested If
/*
    class Number {
    public static void main(String[] args) {

        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Largest number is " + largestNumber);
    }
}
*/

