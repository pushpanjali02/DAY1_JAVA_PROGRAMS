import java.util.Scanner;
public class Highestof3Numbers {
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        System.out.println("Enter 3 values");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[0]>arr[1]&&arr[0]>arr[2]){
            System.out.println(arr[0]+" is highest");
        }
        else if(arr[1]>arr[0]&&arr[1]>arr[2]){
            System.out.println(arr[1]+" is highest");
        }
        else if(arr[2]>arr[0]&&arr[2]>arr[1]){
            System.out.println(arr[2]+" is highest");
        }
    }
}
