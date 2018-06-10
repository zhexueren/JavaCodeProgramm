/*
 * @牛客网编程练习的主函数
 * @Author LiuFenshan
 * @Time:2018-5-27
 */
package NewCodeProgramm;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Vector;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> wordList = new ArrayList<String>();
		Vector<String> wordVec  = new Vector<String>();
		HashSet<String> wordlist = new HashSet<String>();
		wordList.add("a");
		wordVec.add("a");
		wordlist.add("a");
		
		wordList.add("d");
		wordVec.add("d");
		wordlist.add("d");
		
		wordList.add("k");
		wordVec.add("k");
		wordlist.add("k");
		
		wordList.add("b");
		wordVec.add("b");
		wordlist.add("b");
		
		ReplaceSpace_02Test replaceSpace = new ReplaceSpace_02Test();
		replaceSpace.test_replaceSpace();
		
		
		/*01_test
		SearchArray_01Test searchArray = new SearchArray_01Test();
		searchArray.Test_Find();
		*/
	}

}
