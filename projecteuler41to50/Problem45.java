package projecteuler41to50;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class level45{
	void solve0(){
		Long Max_Value=1000000l;
		for(long i=286;i<Max_Value;++i){
			long TriNum=getTriangle(i);
			if(isHexagonal(TriNum) && isPentagonal(TriNum)){
				System.out.println(TriNum);
				break;
			}
		}
	}
	void solve1(){
		Long Max_Value=1000000l;
		for(long i=166;i<Max_Value;++i){
			long TriNum=getPentagonal(i);
			if( isHexagonal(TriNum)){
				System.out.println(TriNum);
				break;
			}
		}
	}
	void solve2(){
		Long Max_Value=1000000l;
		for(long i=144;i<Max_Value;++i){
			long TriNum=getHexagonal(i);
			if( isPentagonal(TriNum)){
				System.out.println(TriNum);
				break;
			}
		}
	}
	void solve3(){
		Long Max_Value=1000000l;
		for(long i=286;i<Max_Value;++i){
			long TriNum=getTriangle(i);
			if( isPentagonal(TriNum)){
				System.out.println(TriNum);
//				break;
			}
		}
	}
	long getTriangle(long index){
		return index*(index+1)/2;
	}
	long getPentagonal(long index){
		return index*(3*index-1)/2;
	}
	long getHexagonal(long index){
		return index*(2*index-1);
	}
	boolean isTriangle(long num){
		long delt=1+8*num;
		if(isSquare(delt)){
			long member=(long) (-1+Math.sqrt(delt));
			if(member%2==0 && member/2>0)
				return true;
		}
		return false;
	}
	boolean isHexagonal(long num){
		long delt=1+8*num;
		if(isSquare(delt)){
			long member=(long) (1+Math.sqrt(delt));
			if(member%4==0 && member/4>0)
				return true;
		}
		return false;
	}
	boolean isPentagonal(long num){
		long delt=1+24*num;
		if(isSquare(delt)){
			long member=(long) (1+Math.sqrt(delt));
			if(member%6==0 && member/6>0)
				return true;
		}
		return false;
	}
	boolean isSquare(long num){
		long n=(long) Math.sqrt(num);
		if(n*n==num)
			return true;
		return false;
	}

}
public class Problem45 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level45().solve3();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"√Î"+Time%1000+"∫¡√Î");
	}
}
