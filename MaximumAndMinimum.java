package ForLoopUsingCondition;

public class MaximumAndMinimum {
	public static void main(String[] args ) {
		int[] nums= {27,87,17,45,99,98,86};
	int max=0;
		int min=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<min)
			{
				min=nums[i];
			}
			else if(max<nums[i])
			{
				max=nums[i];
			}
		}

		System.out.println(min);
		System.out.println(max);
	}
	}
	


