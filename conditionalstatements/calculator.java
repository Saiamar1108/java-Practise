package conditionalstatements;
import java.util.*;
class calculator{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first number");
    int num1=sc.nextInt();
    System.out.println("enter the second number ");
    int num2=sc.nextInt();
    System.out.println("enter the operation you want to do");
    String op=sc.next();
    switch(op){
      case "+":
      System.out.println(num1+num2);
      break;
      case "-":
      System.out.println(num1-num2);
      break;
      case "/":
      System.out.println(num1/num2);
      break;
      case "*":
      System.out.println(num1*num2);
      break;
      default:
      System.out.println("Invalid operation");
    }
  }
}
  