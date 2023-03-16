import java.util.Scanner;
public class Hometask3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("number: ");
            int num = sc.nextInt();
            if (num % 2 == 1)
                System.out.print("neCH");
            else System.out.print("CH");
        }
    }
}