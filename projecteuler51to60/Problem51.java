package projecteuler51to60;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level51{	
	void solve0(){
		//a是要换的 ,相同数据，b是保持不变的
		String[] digits5={"baaab",
					      "abaab",
					      "aabab",
					   	  "aaabb"};
		String[] digits6={"bbaaab",
						  "babaab",
					      "baabab",
					      "baaabb",
					   
					   "abbaab",
					   "ababab",
					   "abaabb",
					   
					   "aabbab",
					   "aababb",
					   
					   "aaabbb"};
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i=0;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<digits5.length;k++){
				ts=Combination(i, j, 0, digits5[k], true);
				if(isPrimeSet(ts))
				System.out.println(i+" "+j+" "+ts+" "+digits5[k]);
				}
				
			}
		}
		TreeSet<String> ts2 = new TreeSet<String>();
		for(int i=0;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int m=0;m<=9;m++){
				for(int k=0;k<digits6.length;k++){
				ts2=Combination(i, j, m, digits6[k], false);
				if(isPrimeSet(ts2)){
//				System.out.println(i+" "+j+" "+ts2+" "+digits6[k]);
				System.out.println(getPrimeSet(ts2));//121313
			
				}
				}
				}
			}
		}

	}
	TreeSet<Integer> getPrimeSet(TreeSet<String> ts){
		Iterator<String> it=ts.iterator();
		TreeSet<Integer> tset = new TreeSet<Integer>(); 
		while(it.hasNext()){
			int prime=Integer.parseInt(it.next());//强制类型转换
			if(isPrime(prime)){
				tset.add(prime);
			}
		}
		
		return tset;
	         
	}
	
	boolean isPrimeSet(TreeSet<String> ts){
		Iterator<String> it=ts.iterator();
		int flag=0;
		while(it.hasNext()){
			int prime=Integer.parseInt(it.next());//强制类型转换
			if(isPrime(prime)){
				flag+=1;
			}
		}
		if(flag>=8)
			return true;
		return false;
	         
	}

	TreeSet<String> Combination(int A,int B,int C,String pattern,boolean flag){
		//第一个1用a代替，第二个1以b代替，第三个1用c代替
		
		TreeSet<String> TSet= new TreeSet<String>();
		if(flag==true){// 5位数
			for(int i=0;i<=9;i++){
				String combStr=pattern.replaceFirst("b", A+"");
				combStr=combStr.replaceFirst("b", B+"");
				combStr=combStr.replace("a", i+"");
				TSet.add(combStr);
			}
		}else if(flag==false){// 6位数
			for(int i=0;i<=9;i++){
				String combStr=pattern.replaceFirst("b", A+"");
				combStr=combStr.replaceFirst("b", B+"");
				combStr=combStr.replaceFirst("b", C+"");
				combStr=combStr.replace("a", i+"");
				TSet.add(combStr);
				
			}
		}
		return TSet;
	}

	boolean isPrime(int num){
		if(num==2||num==3 ||num==5||num==7) return true;
		if(num<2 || num%2==00) return false;
		for(int i=3;i<=Math.sqrt(num);i++)
			if(num%i==0)
				return false;
		return true;
	}

	
}
public class Problem51 {


	public static void main(String[] args){
		long begin= System.currentTimeMillis();
		new level51().solve0();
		long end = System.currentTimeMillis();
		long Time = end - begin;
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}

}
