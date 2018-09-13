import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args){
        Boolean IsATriangle;
        System.out.println("Enter 3 integers which are sides of a triangle:");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Side A is:"+a);
        System.out.println("Side B is:"+b);
        System.out.println("Side C is:"+c);
        if((a+b)>c && (a+c)>b && (b+c)>a){
            IsATriangle = true;
        }
        else
            IsATriangle = false;
        if(IsATriangle){
            if ((a==b) && (b==c)){
                System.out.println("Equilateral");
            }
            else if((a!=b) && (a!=c) && (b!=c)){
                System.out.println("Scalene");
            }
            else
                System.out.println("Isosceles");
        }
        else
            System.out.println("Not A Triangle");

    }
}
