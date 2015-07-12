package projecteuler31to40;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
class level35o{
	void solve(){
		int Max_Value=1000000;
		int num=0;
		int result=4;//2 3 5 7
		boolean[] IsPrime=new boolean[Max_Value];
		IsPrime[2]=true;
		for(int i=3;i<Max_Value;i=i+2){
			IsPrime[i]=isPrime(i);
		}
		for(int i=11;i<Max_Value;i=i+2){
			num=i;
			int len=String.valueOf(num).length();
			while( num<Max_Value  && IsPrime[num]==true && len>0){
				num=Rotation(num);
				len=len-1;
			}
			if(len==0) {
				result+=1;
//				System.out.println(i);
			}

		}
		System.out.println(result);
		
		
	}
	int Rotation(int num){
		int end=num%10;
		int before=num/10;
		int len=String.valueOf(num).length();
		int rot=(int) (Math.pow(10, len-1)*end+before);
		return rot;
	}
	boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num)+1;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
}
class level35{
	void solve(){
		Set<Integer> set=new TreeSet<Integer>();
		set.add(2);
		for(int i=3;i<1000000;i=i+2){
			if(isPrime(i)){
				
				if(isCirclPrime(i)){
					set.add(i);
//					System.out.println(i);
				}	
			}
		}
		System.out.println(set.size());
	}
	boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	boolean isCirclPrime(int num){
		String str=String.valueOf(num);
		int len=str.length();
		int prime;
		for(int i=1;i<len;++i){
			str=RotationString(str);
			prime=Integer.parseInt(str);
			if(isPrime(prime)==true){
			}else{
				return false;
			}
		}
		return true;
	}
	//顺时针旋转一次
	String RotationString(String str){
		String tmp=str.substring(1)+str.charAt(0);
		return tmp;
	}
}
public class Problem35 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level35().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"秒"+Time%1000+"毫秒");
	}
}
