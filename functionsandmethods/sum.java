package functionsandmethods;
import java.util.*;

public class sum {
  public static void sum(int a,int b){
    int sum=a+b;
    System.out.println("The sum is: "+sum);
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();
    sum(num1, num2);
  }

}
