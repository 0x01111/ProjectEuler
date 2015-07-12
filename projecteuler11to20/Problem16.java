package projecteuler11to20;

import java.util.Date;

class level16{
	void solve(){
		int x=2;
		int y=1000;
		String resultString=String.valueOf(x);
		for(int i=1;i<y;i++){
			resultString=StringMultiply(resultString,x);
		}
		long result=sumString(resultString);
		System.out.println("2的1000次方各位数字之和："+result+"\n 结果是： "+resultString);
		
	}
	long sumString(String str){
		long sum=0;
		for(int i=0;i<str.length();i++){
			String subStr=str.substring(i,i+1);
			long num= Long.parseLong(subStr);
			sum+=num;
		}
		return sum;
	}
	String StringMultiply(String str,int x){
		//str * x,x只能是个0-9的数字
		//注意可能在进位的时候超过了最高位。
		int before=0;
		String result="";
		
		for(int i=str.length();i>0;i--){
			String subStr=str.substring(i-1,i);
			int mul=before+Integer.parseInt(subStr)*x;
			if(i==1 && mul>9){//最高位进位
				String temp=  String.valueOf(mul);
				result=temp.concat(result);
			}else if( mul>9){//中间进位
				
				String temp=  String.valueOf(mul%10);
				result=temp.concat(result);
				before=mul/10;
			}else{
				result=String.valueOf(mul).concat(result);
				before=0;
			}
			
		}
		return result;
	}

}
public class Problem16 {
	public static void main(String[] args) {
		Date beginTime=new Date();
		new level16().solve();//1366
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"秒"+Time%1000+"毫秒");
	}

}
