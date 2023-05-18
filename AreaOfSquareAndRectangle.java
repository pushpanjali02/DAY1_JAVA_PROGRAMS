import java.util.Scanner;
public class AreaOfSquareAndRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of the square");
        int s=sc.nextInt();
        System.out.println("Enter length and breadth of the rectangle");
        //int s=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Area of the Square is"+s*s);
        System.out.println("Area of the rectangle is "+l*b);
        
    }
}
