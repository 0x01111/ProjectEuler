package projecteuler21to30;

import java.util.Date;
class level28{
	void solve(){
		int sum=1;
		for(int n=3;n<=1001;n+=2){
			sum+=4*Math.pow(n, 2)-6*n+6;
		}
		System.out.println(sum);
	}

}
public class Problem28 {
	public static void main(String[] args){
		Date beginTime=new Date();
		new level28().solve();//669171001
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
		}
}
