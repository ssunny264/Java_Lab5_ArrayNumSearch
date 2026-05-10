/*
 * Sara Sunny
 * Lab 5 - Problem 2 - Main
 */
package sunny_lab5_prob2;

/**
 *
 * @author slbru
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Sunny_Lab5_Prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Data var = new Data();
        int num = 0;
        
        System.out.println("Enter number to search for: ");
        num = in.nextInt();
        
        var.Read();
        var.Sort();
        
        System.out.println(var.BinarySearch(0, var.getLength(), num));
        
    }
    
}
