package projecteuler11to20;

import java.util.Date;


class level14{
	void solve(){
		long starNum=1000000;
		
		int len=1;
		int maxlength=len;
		long result=0;
		while(starNum--!=1){
			len=1;
			long num=starNum;
			while(num!=1){
				num=Iterative(num);
				len++;
			}
			if(maxlength<len) {maxlength=len;result=starNum;}
//			System.out.println(starNum+" "+len);
		}
		System.out.println(maxlength+" "+result);
	}
	long  Iterative(long num){
		if(num%2==0){
			return num/2;
		}else{
			return 3*num+1;
		}
	}
}
public class Problem14 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level14().solve();//837799
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		
		System.out.println("Time="+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
	}
}
