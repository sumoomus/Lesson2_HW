import java.util.Scanner;
public class Hometask1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("month num ");
        int month_number = sc.nextInt();
        switch (month_number) {
            case 12, 1, 2 -> System.out.print("win");
            case 3, 4, 5 -> System.out.print("spr");
            case 6, 7, 8 -> System.out.print("sum");
            case 9, 10, 11 -> System.out.print("fal");

            default -> System.out.print("try again ");
        }
    }
}

