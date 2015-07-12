package projecteuler21to30;

import java.math.BigInteger;
import java.util.Date;
class level25{
	void solve(){
		BigInteger f1=BigInteger.ONE;
		BigInteger f2=BigInteger.ONE;
		int index=2;
		while(true){
			f1=f1.add(f2);
			f2=f1.subtract(f2);
			index+=1;
			String str=String.valueOf(f1);
//			System.out.println(str);
			if(str.length()>=1000){
				System.out.println(str);
				System.out.println(str.length());
				System.out.println(index);
				break;
			}
		}
	}
	
	
}
public class Problem25 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level25().solve();//4782
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"√Î"+Time%1000+"∫¡√Î");
		}
	
}
