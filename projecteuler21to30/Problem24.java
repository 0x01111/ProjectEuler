package projecteuler21to30;

import java.util.Date;

class level24{
	void solve(){
		int[] fact={1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
		String str="0123456789";
		int l=999999;
		String s1="";
		for(int i=fact.length-1;i>=0;i--){
			int num=l/fact[i];
			s1+=str.charAt(num);
			l-=num*fact[i];
			str=str.substring(0,num)+str.substring(num+1);
		}
		System.out.println(s1+str);
	}
}
public class Problem24 {
	public static void main(String[] args){
	Date beginTime=new Date();
	new level24().solve();//2783915460
	Date endTime=new Date();
	long Time = endTime.getTime()-beginTime.getTime();
	System.out.println("Time:"+Time/1000+"√Î"+Time%1000+"∫¡√Î");
	}
}
