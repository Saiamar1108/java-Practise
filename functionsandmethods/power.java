package functionsandmethods;
import java.util.*;

public class power {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      power(x,y);
  }
  public static int power(int a,int b){
      int p=(int)Math.pow(a,b);
      System.out.println(p);
      return p;
  }
}
