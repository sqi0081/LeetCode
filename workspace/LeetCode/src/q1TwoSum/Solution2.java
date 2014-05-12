package q1TwoSum;

/**
 * Bad soluton
 * Time Limit Exceeded
 * @author SU Qi
 *
 */
public class Solution2 {
	
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
		if(numbers != null)
		{
			for(int i = 0; i <= numbers.length - 2; i++)
			{
				for(int j = i +1; j < numbers.length -1; j++)
				{
					if(numbers[i] != 0 && numbers[j] != 0 && numbers[i] + numbers[j] == target)
					{
						result[0] = i + 1;
						result[1] = j + 1;
						return result;
					}
				}
			}
		}
		return result;
    }

}
