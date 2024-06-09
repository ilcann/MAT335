
import java.util.Scanner;
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        //Input = the size of the matrix A.
        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        //Generator: n*n random matrix A
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 1 + random.nextInt(11); // x in [1,11]
            }
        }

        //Printer
        System.out.println("-Matrix A-");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == n-1)
                    System.out.print(String.format("%2d\n", arr[i][j]));
                else
                    System.out.print(String.format("%2d ", arr[i][j]));
            }
        }

        //Check if the matrix is symetric
        boolean isSymetric = isSysmetric(arr);
        if(isSymetric)
            System.out.println("The matrix is symmetric.");
        else
            System.out.println("The matrix is not symmetric.");
        
        //Close scanner
        scanner.close();
    }
    public static boolean isSysmetric(int[][] squareMat) {
        //Check if the matrix is Symetric or not
        for (int i = 0; i < squareMat.length; i++) {
            for (int j = 0; j < squareMat[i].length; j++) {
                if (squareMat[i][j]!= squareMat[j][i]) {
                    return false; // matrix is not a symetric matrix
                }
            }
        }

        //Default case
        return true; // matrix is a symetric matrix
    }
}
