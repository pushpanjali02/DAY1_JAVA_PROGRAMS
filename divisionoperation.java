import java.util.Scanner;
public class divisionoperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend and divisor");
        double dividend=sc.nextDouble();
        double divisor=sc.nextDouble();
        double quotient=dividend/divisor;
        System.out.println(quotient);

    }
}