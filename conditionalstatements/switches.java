package conditionalstatements;
import java.util.*;
class switches{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    // if (num==1){
    //   System.out.println("hell0");

    // }
    // else if(num==2){
    //   System.out.println("namaste");
    // }
    // else if (num==3){
    //   System.out.println("Bonjour");
    // }
    // else{
    //   System.out.println("Invalid input");
    // }
    switch(num){
      case 1:
       System.out.println("hello");
       break;
      case 2:
       System.out.println("namaste");

       break;
      case 3:
       System.out.println("Bonjour");
       break;
      default:
       System.out.println("Invalid input");
    }


  }
}