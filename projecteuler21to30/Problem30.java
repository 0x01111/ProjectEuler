package projecteuler21to30;

import java.util.Date;
class level30{
	void solve(){
		int sum=0;
		for(int i=99;i<354294;i++){//354294
			int[] Locat=getLocation(i);
			if(i==getpow4(Locat)){
				sum+=i;
//				System.out.println(i+","+getpow4(Locat));
			}
			
		}
		System.out.println(sum);
	}
	int getpow4(int[] locat){
		int pow4=0;
		for(int i=0;i<locat.length;i++){
			pow4=pow4+(int) Math.pow(locat[i], 5);
		}
		return pow4;
	}
	int[] getLocation(int num){
		int[] Locat=new int[6];
		Locat[0]=num%10;
		Locat[1]=(num/10)%10;
		Locat[2]=(num/100)%10;
		Locat[3]=(num/1000)%10;
		Locat[4]=(num/10000)%10;
		Locat[5]=(num/100000)%10;//or num/10000
		return Locat;
	}
}
public class Problem30 {
	public static void main(String[] args){
		Date beginTime=new Date();
		new level30().solve(); //443839
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
		}
}
