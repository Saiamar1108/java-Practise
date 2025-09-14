package functionsandmethods;
import java.util.*;

public class greatestoftwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        greatestoftwo(n1,n2);
    }
  public static void greatestoftwo(int a,int b){
      if(a>b){
          System.out.println(a);
          
      }
      else{
          System.out.println(b);
      }
  }
}