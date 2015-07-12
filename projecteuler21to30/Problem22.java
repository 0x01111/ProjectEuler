package projecteuler21to30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

class level22{
	void solve(){
		String filename="src\\projecteuler21to30\\p022_names.txt";
		 String[] names=ReadTxtFile(filename);
		 for (int i=0;i<names.length;i++)
		 System.out.println(names[i]);
		 int total=0;
		 Arrays.sort(names);
		 for(int i=0;i<names.length;++i){
			 int sum=0;
			 for(char ch:names[i].toCharArray()){
				 sum+=ch-'A'+1;
			 }
			 total+=(i+1)*sum;
		 }
		 System.out.println("名字总得分："+total);
		 
	}
	String[] ReadTxtFile(String filename){
		File fl=new File(filename);
		String line=null;
		String[] str = null;
		try {
			BufferedReader br=new BufferedReader(new FileReader(fl));
			try {
				while((line=br.readLine())!=null){//就一行，一次读完了
					str=line.replace("\"", "").split(",");//replace 正则把\"" 变成空的  //jdk 1.5
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
	}
}
public class Problem22 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level22().solve();//871198282
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"秒"+Time%1000+"毫秒");
	}
}
