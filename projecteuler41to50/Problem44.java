package projecteuler41to50;

import java.util.Date;

class level44{
	void solve2(){
		int minD=9999999;
		int D=0;
		for(int i=2;;++i){
			for(int j=1;j<=i;j++){
				int pi=getPentagonal(i);
				int pj=getPentagonal(j);
				// pj<pi
				if(isPentagonal(pj+pi) && isPentagonal(pi-pj)){
					D=pi-pj;
					if(D<minD){
						minD=D;
						System.out.println(minD);
						return;
					}
				}
			}
		}
	
	}
	
	void solve(){
		int Max_Value=3000;

		int minD=9999999;
		int D=0;
		for(int i=1;i<=Max_Value;++i){
			for(int j=i+1;j<Max_Value;j++){
				int pi=getPentagonal(i);
				int pj=getPentagonal(j);
				// pj>pi
				if(isPentagonal(pj+pi) && isPentagonal(pj-pi)){
					D=pj-pi;
					//if(D<minD){
						minD=D;
						System.out.println(minD+","+i+","+j);
						return;
					//}
				}
			}
		}
		System.out.println(minD);
	}
	int getPentagonal(int index){
		return index*(3*index-1)/2;
	}
	boolean isPentagonal(int num){
		int delt=1+24*num;
		if(isSquare(delt)){
			int member=(int) (1+Math.sqrt(delt));
			if(member%6==0 && member/6>0)
				return true;
		}
		return false;
	}
	boolean isSquare(int num){
		int n=(int) Math.sqrt(num);
		if(n*n==num)
			return true;
		return false;
	}
}
public class Problem44 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level44().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"√Î"+Time%1000+"∫¡√Î");
	}
}
