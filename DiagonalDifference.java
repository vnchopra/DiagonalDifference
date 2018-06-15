import java.util.Scanner;
import java.math.*;

public class DiagonalDifference 
{

	static int diagonalDifference(int[][] a) 
	{
        // Complete this function
		DiagonalDifference dd = new DiagonalDifference();
		return dd.generateDiagonalDifferenceResult(a);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++)
        {
            for(int a_j = 0; a_j < n; a_j++)
            {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }

    
    private int generateDiagonalDifferenceResult(int[][] twodimenarray)
    {
    	//Final Result
    	int result_val = 0;
    	
    	//Initialize Dimension Indexes
    	int firstSum = 0;
    	int secondSum = 0;

    	firstSum = this.getfirstDiagonalSum(twodimenarray);
    	secondSum = this.getSecondDiagonalSum(twodimenarray);
    	
    	result_val = firstSum - secondSum;
    	
    	result_val = Math.abs(result_val);
    	
		
		return result_val;
    }
    
    //Need to get first diagonal sum
    	//need to track row
    	//need to track column
    	//need to track sum as it traverses through diagonal
    
    private int getfirstDiagonalSum(int[][] twodimenarray)
    {
    	//Final Result
    	int diagonalSum = 0;
    	
    	int tracked_row = 0;
    	int tracked_column = 0;
    	
    	int array_length = twodimenarray.length;

    	for(int i=0; i<array_length; i++)
    	{
    		tracked_column = i;
    		tracked_row = i;
    		
    		diagonalSum = diagonalSum + twodimenarray[tracked_column][tracked_row];

    	}
    	
    	return diagonalSum;
    }
    
    private int getSecondDiagonalSum(int[][] twodimenarray)
    {
    	//Final Result
    	int diagonalSum = 0;
    	
    	int tracked_column = twodimenarray.length-1;
    	int tracked_row = 0;
    	
    	int array_length = twodimenarray.length;
    	
    	for(int i=array_length-1; i>=0; i--)
    	{
    		tracked_column = i;
    		diagonalSum = diagonalSum + twodimenarray[tracked_column][tracked_row];
    		tracked_row = tracked_row+1;
    	}
    	
    	return diagonalSum;
    }
  
}
