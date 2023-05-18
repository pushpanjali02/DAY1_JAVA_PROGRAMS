import java.util.Scanner;
public class AgeGroup{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age<=12){
            System.out.println("Child");
        }
        else if(age>12&&age<=19){
            System.out.println("Teeneger");
        }
        else if(age>20&&age<75){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior citizen");
        }
    }
}
