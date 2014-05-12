package q151ReverseWordsInAString;

import java.util.LinkedList;

/**
 * 
 * @author SU Qi
 * Runtime 476ms
 */
public class Solution1 {
	public String reverseWords(String s){
		int i = s.length()-1;
		int h = -1;
		StringBuffer temp = new StringBuffer();
		while (i >= 0)
		{
			if(s.charAt(i) == ' ' && h == -1)
			{					
				i--;
			}
			else if(s.charAt(i) == ' ' && h != -1)
			{
				if(i >= 1 && s.charAt(i-1) == ' ') i--;
				else if(i >= 1 && s.charAt(i-1) != ' ')
				{
					temp.append(' ');
					i--;
				}
				else
				{
					break;
				}
					
			}
			else
			{
				LinkedList<String> ls = new LinkedList<String>();
				while(i >= 0 && s.charAt(i) != ' ')
				{
					ls.addLast(String.valueOf(s.charAt(i)));
					i--;
				}
				h = 0;
				temp.append(swap(ls));
			}
		}
		return temp.toString();
	}
	
	public String swap(LinkedList<String> l)
	{
		String word = new String();
		for(int i = l.size()-1; i >=0; i--)
		{
			word += l.get(i);
		}
		return word;
		
	}
}
