package projecteuler31to40;

import java.util.Date;

class level33{
	void solve(){
		int A=1;
		int B=1;
		int Z;
		int M;
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++){
				for(int c=2;c<=9;c++){
					Z=a*10+b;
					M=b*10+c;
					if(Z*c==M*a && a!=b && a<c){
						A=A*a;
						B=B*c;
						System.out.println(Z+"/"+M+" = "+a+"/"+c);
					}
					
					Z=b*10+a;
					M=c*10+b;
					if(Z*c==M*a && a!=b && a<c){
						A=A*a;
						B=B*c;
						System.out.println(Z+"/"+M+" = "+a+"/"+c);
					}
					
				}
			}
		}
		System.out.println(A+" "+B);
		int res=B/gcd(A,B);
		System.out.println(res);
	}
	int gcd(int a,int b){
		if(a<b){
			int temp=a;a=b;b=temp;
		}
		int r;
		while(b!=0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
public class Problem33 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level33().solve();
		Date endTime=new Date();
		Long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"Ãë"+Time%1000+"ºÁÃë");
	}
}
