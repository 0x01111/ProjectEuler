package projecteuler31to40;

import java.util.Date;

class level36{
	void solve2(){
		int Max_Value=1000000;
		int sum=0;
		for(int i=1;i<Max_Value;i++){
			if(JudgePalindromic(i) && JudgePalindromic(Integer.toBinaryString(i))){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	void solve(){
		int Max_Value=1000000;
		int sum=0;
		for(int i=1;i<Max_Value;i++){
			String str=String.valueOf(i);
			if(JudgePalindromic(str)){
				String binary=DecimalToBinary(i);
				if(JudgePalindromic(binary)){
					sum+=i;
//					System.out.println(i);
				}
			}
		}
		System.out.println(sum);
	}
	
	String DecimalToBinary(int num){
		String str="";
		while(num!=0){
			int by=num%2;
			str=by+str;
			num/=2;
		}
		return str;
	}
	boolean JudgePalindromic(String str){
//		String str=String.valueOf(num);
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
	boolean JudgePalindromic(int num){
		String str=String.valueOf(num);
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
}
public class Problem36 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level36().solve();//872187
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
