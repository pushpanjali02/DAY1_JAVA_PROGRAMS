import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        int sum=0,n=0;
        double avg=0;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];//Declaring an array.
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are");
        for(int j=0;j<5;j++){
            //int sum=0,avg=0,n=1;
            sum=sum+arr[j];
           
            n++;
            System.out.println(n);
            //System.out.println(arr[j]);
        }
        avg=sum/n;
        System.out.println();
        System.out.println("Sum is: "+sum+"Average is: "+avg);
        
    
        
    }
    

}
