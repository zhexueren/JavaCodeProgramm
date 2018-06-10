/*
 * @Descpribe:
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author:LiuFenshan
 * @Time:2018-5-27
 */

package NewCodeProgramm;

public class SearchArray_01Test
{
	public boolean Find(int target, int [][] array)
	{
		if(0 == array.length)
		{
			return false;
		}
		
		int rowLen = array.length;
		int colLen = array[0].length;
		
		int row = rowLen-1;
		int col = 0;
		while(row>=0 && col<=colLen-1)
		{
			if(array[row][col]>target)
			{
				row--;
			}
			else if(array[row][col]<target)
			{
				col++;
			}
			else
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void Test_Find()
	{
		int target = 10;
		int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
		boolean Ret = Find(target, array);
		System.out.println("Find Function Return:"+Ret);
	}
}
