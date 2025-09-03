package patterns;
import java.util.*;

public class floydstriangle {
  /**
   * @param args
   */
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(c);
        c=c+1;
      }
      System.out.println();

    }
    
    }
  }

  

