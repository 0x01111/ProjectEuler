package projecteuler41to50;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
class OOOO { 
	 public static long sum=0;
	}
class level43{
	
	
	void solve(){
		String[] numStr={"1","2","3","4","5","6","7","8","9","0"};
		permutation(numStr,0,9,0);
	}
	
	boolean divisible(String[] numStr,int[] div){
		for(int i=1;i<=7;i++){
			int d=Integer.valueOf(numStr[i]+numStr[i+1]+numStr[i+2]);
			if(d%div[i-1]!=0){
				return false;
			}
		}
		return true;
	}

	void permutation(String[] str,int start,int end,int sum1){
		int[] div={2,3,5,7,11,13,17};
		if(start==end){

			 if(divisible(str,div)){
				 StringBuffer sb=new StringBuffer();
				 for(int i=0;i<=9;i++)
					 sb.append(str[i]);
				 String res=sb.toString();
//				 Set set=new TreeSet();
//				 set.add(res);
				 
				 OOOO.sum+=Long.valueOf(res);
				 System.out.println(OOOO.sum+" "+res);
			 }
			 
		}
		for(int i=start;i<=end;i++){//交换数组第一个元素与后续的元素  
			String temp=str[start];
			str[start]=str[i];
			str[i]=temp;
			permutation(str,start+1,end,0);//后续元素递归全排列  
			
			temp=str[start];//将交换后的数组还原  
			str[start]=str[i];
			str[i]=temp;
		}
	}
}
public class Problem43 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level43().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"秒"+Time%1000+"毫秒");
	}
}
