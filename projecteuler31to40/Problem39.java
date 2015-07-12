package projecteuler31to40;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level39{

	void solve2(){
		int Max_Value=1000;
		int result=0;
		int maxs=0;
		for(int s=12;s<Max_Value;s++){
			int num=0;
			for(int a=3;a<=s-1;a++){
				int b1=(s*s-2*s*a)/(2*s-2*a);
				int b2=(s*s-2*s*a)%(2*s-2*a);
				if(b2==0 && b1>0 && (b1>=a) ){//&& a*a+b1*b1==(s-a-b1)*(s-a-b1)){
					num+=1;
//					if(s==840)
//					System.out.println(a+","+b1+","+(s-a-b1));
				}
			}
			if(num>result) {
				result=num;
				maxs=s;
			}
		}
		System.out.println(result+","+maxs);
	}
	void solve(){
		int Max_Value=1000;
		int result=0;
		int maxs=0;
		for(int s=12;s<Max_Value;s++){
			int num=0;
			for(int a=3;a<=s-1;a++){
				for(int b=a;b<=s;b++){
					
					if(s*s+2*a*b==2*s*a+2*s*b){
						num+=1;
					}
				}
			}
			if(num>result) {
				result=num;
				maxs=s;
			}
		}
		System.out.println(result+","+maxs);
	}
	
}
public class Problem39 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level39().solve2();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
