package loops;
import java.util.*;

class marks {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input;

    do {
      int marks = sc.nextInt();
      if (marks >= 90) {
        System.out.println("Excellent");
      } else if (marks >= 80) {
        System.out.println("Very Good");
      } else if (marks >= 70) {
        System.out.println("Good");
      } else if (marks >= 60) {
        System.out.println("Average");
      } else {
        System.out.println("Poor");
      }
      System.out.println("Do you want to continue? Press 1 for Yes, 0 for No:");
      input = sc.nextInt();
    } while (input == 1);

    System.out.println("You have entered all the marks.");
    sc.close();
  }
}