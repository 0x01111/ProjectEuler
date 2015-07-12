package projecteuler11to20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
class level13{
	void solve() throws IOException{
		String fileName="src\\projecteuler11to20\\p13.txt";
		String str=ReaderTxtFile(fileName);
		char[] strArray=str.toCharArray();
		String sum="";
		int result=0;
		for(int i=49;i>=0;i--){
			System.out.print(result+" ");
			result=result+caculate(strArray,i);
			if(result>9 && i!=0){
				sum+=result%10;
				result=result/10;
			}else if(i==0){
				sum=turn(sum);//前面的结果要反序，从后向前加，然后一个一个连接起来的。
				sum=result+"".concat(sum);//最高位直接连接起来
			}else result=0;
			
			
		}
		System.out.println(sum);
		System.out.println(sum.substring(0, 10));

	}
	String turn(String str){
		String trunStr="";
		char[] str1=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			trunStr+=str1[i];
		}
		return trunStr;
	}
	int caculate(char[] Array,int firstIndex){//index 
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=Array[firstIndex+50*i]-'0';
//			System.out.print(Array[firstIndex+50*i]+" ");
		}
		System.out.println(sum);
		return sum;
	}
	String ReaderTxtFile(String fileName) throws IOException{
		File fl=new File(fileName);
		BufferedReader br=new BufferedReader(new FileReader(fl));
		StringBuilder sb=new StringBuilder();
		String str="";
		while((str=br.readLine())!=null){
			sb.append(str);
		}
		return sb.toString();
	}
}
public class Problem13 {

	public static void main(String[] args) throws IOException{
		Date beginTime=new Date();
		new level13().solve();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"秒"+Time%1000+"毫秒");
	}
}
