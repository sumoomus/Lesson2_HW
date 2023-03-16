import java.util.Scanner;
public class Hometask5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-7 rainbow color: ");
        int color = sc.nextInt();
        switch (color) {
            case 1 -> System.out.print("red");
            case 2 -> System.out.print("ora");
            case 3 -> System.out.print("yel");
            case 4 -> System.out.print("gre");
            case 5 -> System.out.print("l.blue");
            case 6 -> System.out.print("blue");
            case 7 -> System.out.print("purp");
        }
    }
}
