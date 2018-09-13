import java.util.Scanner;

public class Triangle3 {
    public static void main(String[] args){
        Boolean c1,c2,c3,IsATriangle;
        System.out.println("Enter 3 integers which are sides of a triangle:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        c1 = (1<=a)&&(a<=200);
        c2 = (1<=b)&&(b<=200);
        c3 = (1<=c)&&(c<=200);
        if(c1==false){
            System.out.println("Value of a is not int the range of permitted value");
        }
        if(c2==false){
            System.out.println("Value of b is not int the range of permitted values");
        }
        if(c3==false){
            System.out.println("Value of c is not int the range of permitted values");
        }
        if(c1&&c2&&c3){
            System.out.println("Side A is:"+a);
            System.out.println("Side B is:"+b);
            System.out.println("Side C is:"+c);
            if((a<(b+c)) && (b<(a+c)) && (c<(a+b))){
                IsATriangle = true;
            }
            else
                IsATriangle = false;
            if(IsATriangle) {
                if ((a == b) && (b == c)) {
                    System.out.println("Equilateral");
                } else if ((a != b) && (a != c) && (b != c)) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("Isosceles");
                }
            }
            else
                System.out.println("Not a Triangle");
        }

    }
}
