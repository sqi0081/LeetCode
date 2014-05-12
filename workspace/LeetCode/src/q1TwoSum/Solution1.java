package q1TwoSum;

import java.util.HashMap;

/**
 * Runtime: 380 ms
 * @author SU Qi
 *
 */
public class Solution1 {
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		if(numbers != null)
		{
			for(int i = 0; i <= numbers.length - 1; i++)
			{
				if(hm.containsKey(numbers[i]))
				{
					result[0] = hm.get(numbers[i]) + 1;
					result[1] = i + 1;
					return result;
				}
				else
				{
					hm.put(target - numbers[i], i);
				}
			}
			
		}
		return result;
	}

}
