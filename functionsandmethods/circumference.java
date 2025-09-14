package functionsandmethods;
import java.util.*;

public class circumference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius");
        int r=sc.nextInt();
        circumference(r);

    }
    public static double circumference(int a){
        double c=2.0*3.14*a;
        System.out.println("The circumference is: " + c);
        return c;
    }
}


  
  