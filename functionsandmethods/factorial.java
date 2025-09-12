package functionsandmethods;
import java.util.*;


public class factorial {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    factorial(num);

  }
  public static int factorial(int n){
    int result = 1;
    for(int i=n;i>=1;i--){
      result=result*i;
      

    }
    
    System.out.println("The factorial is: " + result);
    return result;

  }
  
}
