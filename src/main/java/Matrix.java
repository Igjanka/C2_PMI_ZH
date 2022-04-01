import java.util.ArrayList;

public class Matrix
{
    public static int numberOfNonZeroValues(int[][] matrix)
    {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i =0;  i < matrix.length; i++)
        {
            for (int j =0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] != 0){
                    array.add(matrix[i][j]);
                }
            }
        }
        int result = array.size();

        return result;
    }
    public static int indexOfColumnsWithSameValues(int[][] matrix)
    {
        int result = 0;

        for ( int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == );
            }
        }
        return result;
    }
}
