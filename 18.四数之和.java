/*
给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
注意：
答案中不可以包含重复的四元组。
示例：
给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
满足要求的四元组集合为：
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/
class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res=new ArrayList<>();
		for (int i=0; i<nums.length-3;i++ ) {
			if(i>0&&nums[i-1]==nums[i])
				continue;
			for (int k=i+1; k<nums.length-2; k++) {
				if(k>i+1&&nums[k-1]==nums[k])
					continue;
				int L=k+1,R=nums.length-1;
				while(L<R){
					int sum=nums[i]+nums[k]+nums[L]+nums[R];
					if (sum>target){
						R--;
					}else if(sum<target){
						L++
					} else{
						res.add(Arrays.asList(nums[i],nums[k],nums[L],nums[R]));
						while(L<nums.length-1&&nums[L]==nums[L+1]){
							L++;
						}
						while(R>0&&nums[R]==nums[R-1]){
							R--;
						}
						L++;
						R--;
					}
				}
			}
		}
		return res;
	}
}