package functionsandmethods;
import java.util.*;

public class eligibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        eligibility(a);
    }
    public static void eligibility(int a){
        if (a>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
  
}