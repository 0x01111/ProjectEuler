package projecteuler31to40;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level40{	
	void solve(){
		//d1 ¡Á d10 ¡Á d100 ¡Á d1000 ¡Á d10000 ¡Á d100000 ¡Á d1000000
		int Max_Value=1000000;
		int result=1;
		int number=0;
		int d=1;
		for(int i=1;i<Max_Value;i++){
			int before=String.valueOf(i).length();
			if(number<d && number+before<=d && d<=1000000){
				if(number+before==d){
					d=d*10;
					result*=Integer.parseInt(String.valueOf(i).substring(before-1));
				}
				number+=before;
			}else if(number<d && number+before>d && d<=1000000){
				result*=Integer.parseInt(String.valueOf(i).substring((d-number-1),d-number));
				number+=before;
				d=d*10;	
			}
			if(d>1000000){
				System.out.println(result);
				return ;
			}
			
		}
		
	}
	
	
}
public class Problem40 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level40().solve();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
