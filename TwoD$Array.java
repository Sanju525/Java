import java.util.Scanner;
class TwoD$Array {
    public static void main(String[] args){
        int[][] array = new int[4][4];
        Scanner input = new Scanner(System.in);
        byte i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        for(i=1;i<=array.length;i++)
        {
                System.out.println(array[i]);
                System.out.println("\t");
        }
    }
}
