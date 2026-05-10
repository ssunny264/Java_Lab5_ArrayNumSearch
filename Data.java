/*
 * Sara Sunny
 * Lab 5 - Problem 2 - class Data
 */
package sunny_lab5_prob2;

/**
 *
 * @author slbru
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Data {
    int row = 0, column = 0;
    int[] array= new int [1000];
    
    File f = new File("File.txt");
    
    public void Read(){
        try ( Scanner in = new Scanner(f)) {
            
            while (in.hasNext()) {                       //reads file into array
                
                for (int i= 0; i<array.length; i++){
                    array[i] = in.nextInt();
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Sort(){                                     //Selection Sort
        for (int count = 0; count < array.length - 1; count++){
            int smallest = count; 
            for (int i = count+1; i<array.length; i++) {
                if (array[i] < array[smallest]){ 
                    smallest = i; 
                }
            }
            int sNum = array[smallest]; 
            array[smallest] = array[count];
            array[count] = sNum;
        }
    }
    public int getLength(){
        return array.length-1;
    }
    public int BinarySearch(int low, int high, int key){
               
        if (low > high) {
            return -911;
        }
        else {
            int mid = (low + high)/2;
            
            if (key ==array[mid]){
                return array[mid];
            }
            else if (key < array[mid]){
                return BinarySearch(low, mid-1, key);
            }
            else if (key > array[mid]){
                return BinarySearch(mid +1, high, key);
            }
        }
        return key;
    }
         
}
