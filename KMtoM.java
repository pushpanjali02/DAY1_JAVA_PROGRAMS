import java.util.Scanner;
public class KMtoM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        int km=sc.nextInt();
        int m=km*1000;
        System.out.println("Distance in meters is: "+m);
    }
    
}
