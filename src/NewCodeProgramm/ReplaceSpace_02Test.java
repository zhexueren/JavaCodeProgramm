/**
 * @Descpiber:��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
