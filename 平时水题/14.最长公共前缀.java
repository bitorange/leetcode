// class Solution {
// 	public String longestCommonPrefix(String[] strs) {
// 		if (strs==null||strs.length==0) {
// 			return "";
// 		}
// 		for (int i=0; i<strs[0].length(); i++) {
// 			char c=strs[0].charAt(i);
// 			for (int j=0; j<strs.length; j++) {
// 				if(i>=strs[j].length()||strs[j].charAt(i)!=c){
// 					return strs[0].substring(0,i);
// 				}
// 			}
// 		}
// 		return strs[0];
// 	}
// }

class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs==null||strs.length==0) {
			return "";
		}
		String pre=strs[0];
		for(int i=0;i<strs.length;i++){
			while(strs[i].indexOf(pre)!==0){
				pre=pre.substring(0,pre.length()-1);
				if (pre=="") {
					return "";
				}
			}
		}
		return pre;
	}
}