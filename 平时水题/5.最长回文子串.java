/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
*/

class Solution {
	public String longestPalindrome(String s) {
		int len1=0,len2=0,len=0;
		int start=0,end=0;
		for (int i=0; i<s.length()-1; i++) {
			len1=palindromeLength(s,i,i);
			len2=palindromeLength(s,i,i+1);

			len=Math.max(len1,len2);
			if (len>end-start) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		return s.substring(start,end+1);
	}
	public int palindromeLength(String s,int left,int right){
		while (left>=0&&right<s.length()) {
			if(s.charAt(left)==s.charAt(right)){
				left--;
				right++;
			}else{
				break;
			}
		}

		return right-left-1;
	}
}