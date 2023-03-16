import java.util.Scanner;
public class HomeTask2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("month num ");
            int month_number = sc.nextInt();
            if (month_number == 12 | month_number == 1 | month_number == 2){
                System.out.print("win");
            } else if (month_number == 3 | month_number == 4 | month_number == 5) {
                System.out.print("spr");
            } else if (month_number == 6 | month_number == 7 | month_number == 8) {
                System.out.print("sum");
            } else if (month_number == 9 | month_number == 10 | month_number == 11) {
                System.out.print("fal");
            }else System.out.print("try again ");

        }
        }
