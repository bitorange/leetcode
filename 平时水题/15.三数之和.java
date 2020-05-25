class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res=new ArrayList<>();
		for (int i=0; i<nums.length; i++) {
			if(nums[i]>0) break;
			if(i>0&&nums[i]==nums[i-1]) continue;
			int L=i+1,R=nums.length-1;
			while(L<R){
				int tmp=nums[i]+nums[L]+nums[R];
				if (tmp>0) {
					R--;
				} else if(tmp<0){
					L++;
				} else {
					res.add(Arrays.asList(nums[i],nums[L],nums[R]));
					while(L+1<nums.length&&nums[L]==nums[L+1]){
						L++;
					}
					while(R-1>=0&&nums[R]==nums[R-1]){
						R--;
					}
					L++;
					R--;
				}
			}
		}
		return res;
	}
}