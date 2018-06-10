/*
 * @Descpribe:
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
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
