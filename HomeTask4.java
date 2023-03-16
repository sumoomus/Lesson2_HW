import java.util.Scanner;
public class HomeTask4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("temp outside: ");
            int temp = sc.nextInt();
            if (temp > -5) {
                System.out.print("hot");
            } else if ((-5 <= temp) | (temp > -20)) {
                System.out.print("norm");
            } else
                System.out.print("cold");
       }
    }
}
