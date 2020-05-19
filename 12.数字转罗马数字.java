class Solution {
	public String intToRoman(int num) {
		int[] money={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] moneyToStr={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String result="";
		int index=0;
		while(num>0){
			if (num>=money[index]) {
				num=num-money[index];
				result=result+moneyToStr[index];
				index--;
			}
			index++;
		} 
		return result;
	}
}