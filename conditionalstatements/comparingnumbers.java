package conditionalstatements;
import java.util.*;
class comparingnumbers{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int num1=sc.nextInt();
     int num2=sc.nextInt();
      if (num1==num2){
        System.out.println("given numbers are equal");

      }
      else if(num1>num2){
        System.out.println("num1 is greater than num2");


      }
      else if (num1<num2){
        System.out.println("num2 is greater than num1");
      }
      else{
        System.out.println("give correct input");
      }



  }

}