
/**
 * Write a description of class ArrayMethodCopy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodCopy
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int[] grades = new int[amount];
        
        
        for(int i = 0; i < amount; i++) 
        {
            int x = input.nextInt();
            grades[i] = x;
        }
        
        System.out.println(Arrays.toString(grades));
    }
}
