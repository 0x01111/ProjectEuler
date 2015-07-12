package projecteuler31to40;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class level32{
	void solve(){//45228
		int p;
		int result=0;
		int Min=4;
		int Max=1972;
		Set<Integer> set=new TreeSet<Integer>();
		for(int a=Min;a<=Max;a++){
			for(int b =a+1;b <=Max;b ++){
				p=a*b ;
				if(isPandigital(a,b,p)){
					set.add(p);
				}
			}
		}
		Iterator it=set.iterator();
		while(it.hasNext()){
			int res=(Integer) it.next();//强制类型转换
			result+=res;
		}
		System.out.println(result);
	}
	boolean isPandigital(int a,int b,int c){
		StringBuilder st=new StringBuilder();
		st.append(a).append(b).append(c);
		//长度不为9，或者包含0
		if(st.length()!=9||st.indexOf("0")>-1) return false;
		
		Set<Character> set=new TreeSet<Character>();
		for(int i=0;i<9;i++){
			set.add(st.charAt(i));
		}
		//只有长度为9时候，说明包含1-9,9个数字
		if(set.size()==9){
			return true;
		}else{
			return false;
		}
	}

}
public class Problem32 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level32().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"s"+Time%1000+"ms");
	}
}
