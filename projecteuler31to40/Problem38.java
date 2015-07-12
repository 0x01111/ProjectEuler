package projecteuler31to40;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level38{

	void solve(){
		int Max_Value=9999;
		int num=0;
		int max=0;
		for(int i=2;i<Max_Value;i++){
			int digitnum=Mulitnum(i);
			if(digitnum>max && JudgeNineDigit(digitnum) ){
				max=digitnum;
				num=i;
			}
		}
		System.out.println(max+","+num);
	}
	int Mulitnum(int num){
		String str=String.valueOf(num);
		for(int i=2;i<=9;i++){
			if(str.length()<9){
				int res=num*i;
				str=str.concat(String.valueOf(res));
				
			}
		}
		if(str.length()>9) return 0;
		return Integer.parseInt(str);
	}
	boolean JudgeNineDigit (int num){
		String str=String.valueOf(num);
		Set<Character> set=new TreeSet<Character>();
		if(str.length()!=9) return false;
		if(str.indexOf("0")>-1) return false;
		for(int i=0;i<9;i++){
			set.add(str.charAt(i));
		}
		if(set.size()==9) return true;
		return false;
	}
	
}
public class Problem38 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level38().solve();//932718654
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
