package functionsandmethods;
import java.util.*;

public class product {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result = Product(a, b);
    System.out.println("The product is: " + result);
  }
  public static int Product(int a, int b){
    return a*b;
  }
  
}
