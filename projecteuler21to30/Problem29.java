package projecteuler21to30;

import java.util.Date;
import java.util.TreeSet;

class level29{
	void solve(){
		int startA=2;
		int endA=100;
		int startB=2;
		int endB=100;
		int num=0;
		TreeSet set=new TreeSet();
		for(int i=startA;i<=endA;i++){
			for(int j=startB;j<=endB;++j){
//				long powab=(long) Math.pow(i, j);//��2��100�η�������Խ�������������������ԡ�
				//long�����2��64�η�-1.������Ϊת��long�ǵĻ�
				double powab= Math.pow(i, j);
				if(set.add(powab)){//set.add(Math.pow(i, j))
					num++;
//					System.out.print(powab+"��");
				}
			}
		}
		
		System.out.println(set.size()+","+num);
	}

}
public class Problem29 {
	public static void main(String[] args){
		Date beginTime=new Date();
		new level29().solve(); //9183
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"��"+Time%1000+"����");
		}
}
