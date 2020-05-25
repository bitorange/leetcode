class Solution {
	public int romanToInt(String s) {
		HashMap<String,Integer> money = new HashMap();
		money.put("M",1000);
		money.put("CM",900);
		money.put("D",500);
		money.put("CD",400);
		money.put("C",100);
		money.put("XC",90);
		money.put("L",50);
		money.put("XL",40);
		money.put("X",10);
		money.put("IX",9);
		money.put("V",5);
		money.put("IV",4);
		money.put("I",1);

		int i=0,result=0;
		while(i<s.length()){
			if(i+1<s.length()&&money.containsKey(s.substring(i,i+2))){
				result+=money.get(s.substring(i,i+2));
				i=i+2;
			}else{
				result+=money.get(s.substring(i,i+1));
				i++;
			}
		}

		return result;
	}
}