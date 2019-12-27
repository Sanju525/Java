import java.util.Scanner;
class BitShiftoperator {
    public static void main(String[] args){
        System.out.println("Enter a value");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp;
        System.out.println(num);
        temp = num;
        System.out.println("The entered value after left shifting");
        temp = temp<<1;
        System.out.println(temp);
        temp = num;
        System.out.println("The entered value after right shifting");
        temp = temp>>1;
        System.out.println(temp);

    }
}
