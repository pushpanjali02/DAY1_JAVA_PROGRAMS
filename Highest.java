import java.util.Scanner;
public class Highest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        if(num1>num2){
            System.out.println(num1+"is higher");
        }
        else{
            System.out.println(num2+"is higher");
        }
        
    }
    
}
