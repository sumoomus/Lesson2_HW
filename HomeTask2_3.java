import java.util.Scanner;

public class HomeTask2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num, sum = 0;
        System.out.println("enter num  :");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            sum += i;

            System.out.println(" " + num + " " + sum);

        }
    }
}
