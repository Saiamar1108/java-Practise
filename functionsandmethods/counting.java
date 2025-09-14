package functionsandmethods;
import java.util.*;

public class counting {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int p=0;
       int n=0;
       int z=0;
       String c;
       
       do{
           int i=sc.nextInt();
           
           if(i>0){
               p++;
           }
           else if(i<0){
               n++;
               
           }
           else{
               z++;
           }
           System.out.print("print y to continue");
            c=sc.next();

       }while(c.equals("y"));
       System.out.println(p);
       System.out.println(n);
       System.out.println(z);
    }
  
}