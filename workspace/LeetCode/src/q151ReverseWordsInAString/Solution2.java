package q151ReverseWordsInAString;

/**
 * 
 * @author SU Qi
 * Runtime: 396 ms
 */
public class Solution2 {

	public String reverseWords(String s){	 
		StringBuffer sb = new StringBuffer();
		if (!s.isEmpty())
		{
			String[] temp = s.split(" ");
			for(int i = temp.length-1; i >= 0 ; i--)
			{
				if(!temp[i].isEmpty())
				{
					sb.append((temp[i]) + " ");
				}
			}
			if(sb.length() >= 2 && sb.charAt(sb.length()-1) == ' ')
				sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
	
}
