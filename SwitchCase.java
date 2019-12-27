import java.util.Scanner;
class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day related number");
        int num = input.nextInt();
        String day;
        switch(num){
            case 1:day="Monday";break;
            case 2:day="Tuesday";break;
            case 3:day="Wednesday";break;
            case 4:day="Thrusday";break;
            case 5:day="Friday";break;
            case 6:day="Saturday";break;
            case 7:day="Sunday";break;
            default:day="invalid day";
        }
        System.out.println("Entered day number referse to\t" + day);
    }

}
