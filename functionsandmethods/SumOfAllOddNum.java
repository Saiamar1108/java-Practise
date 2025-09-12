package functionsandmethods;
import java.util.*;

public class SumOfAllOddNum {
  public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      SumOfAllOddNum(n);
      
  
  }
  public static void SumOfAllOddNum(int a){
      int sum=0;
      for (int i=1;i<=a;i++){
          if(i%2==1){
              sum=sum+i;
              
          }
      }System.out.println(sum);
      


  }}
