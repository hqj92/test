import java.util.Scanner;
public class Triangle1<a, b, c, match> {
    public static void main(String[] args) {
        System.out.println("Enter 3 Integer which are sides of a triangle:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Side A is:"+a);
        System.out.println("Side B is:"+b);
        System.out.println("Side C is:"+c);
        int match = 0;
        if (a == b) {
            match = match + 1;
        }
        if (a == c) {
            match = match + 2;
        }
        if (b == c) {
            match = match + 3;
        }
        if (match == 0) {
            if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
                System.out.println("Not A Triangle"); //不是三角形
            } else
                System.out.println("Scalene"); //不是等边三角形
        } else if (match == 1) {
            if ((a + b) <= c) {
                System.out.println("Not A Triangle");
            } else
                System.out.println("Isosceles");
        } else if (match == 2) {
            if ((a + c) <= b) {
                System.out.println("Not A Triangle");
            } else
                System.out.println("Isosceles");
        } else
            System.out.println("Equilateral");

    }
}
