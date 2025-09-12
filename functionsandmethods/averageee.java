package functionsandmethods;
import java.util.*;

public class averageee {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    average(num1,num2,num3);

  }
  public static void average(int a,int b,int c){
    float avg=(a+b+c)/3;
    System.out.println("The average is: " + avg);
  }
}