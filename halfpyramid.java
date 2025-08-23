class halfpyramid {
  public class halfPyramid {
    public static void main(String[] args) {
        int rows = 5;  // number of rows for the pyramid

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // move to the next line
            System.out.println();
        }
    }
}

  
}
