/**
 * @Descpiber:请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
package NewCodeProgramm;

/**
 * @author Liu_f
 * @time  2018-5-27
 */
public class ReplaceSpace_02Test
{	
	public String replaceSpace(StringBuffer str) 
	{
		int spacePos = 0;
    	if(0 == str.length())
    	{
    		return str.toString();
    	}
    	
    	spacePos = str.indexOf(" ");
    	while(-1 != spacePos)
    	{
    		str.replace(spacePos, spacePos+1, "%20");
    		spacePos = str.indexOf(" ");
    	}
    	
    	return str.toString();
    }
	
	public void test_replaceSpace()
	{
		
		String str1 = new String("We Are Happy.");
		String str2 = new String("   ");
		
		
		String str = str2;
		System.out.println("Replace Before:"+str);
		
		String Ret = replaceSpace(new StringBuffer(str));
		System.out.println("Replace Before:"+Ret);
		
	}
}
