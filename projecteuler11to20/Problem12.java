package projecteuler11to20;

import java.util.Date;

class level12{
	void solve(){
		int num=1;
		int index=500;
		num=Divisor(index);
		System.out.println("num"+num);
	}
	int Divisor(int index){
		int num=1;
		int divisornum=2;
		int trianglenumber=1;
		while(num!=0){
//		if(trianglenumber==1) return 1;
		//�����������Ƶģ����ֻ��һ�룬����Ϊʲô�ҾͲ�֪���ģ���Ȼһ��һ���ı����˷Ѻܳ�ʱ��ģ�����û����ġ�
		for(int i=2;i<=Math.sqrt(trianglenumber);i++){
			if(trianglenumber%i==0){
				divisornum++;
			}
		}
		divisornum*=2;
//		System.out.println("divisornum="+divisornum+" ");
		if(divisornum>=index){
			break;
		}
		else {
			divisornum=2;
			num++;
			trianglenumber=num*(num+1)/2;
//			System.out.print(trianglenumber+" "+num);
			}
		}
		return trianglenumber;
	}
}
public class Problem12 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level12().solve();//76576500
		Date endTime=new Date();
		long time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+time/1000+"��"+time%1000+"����");
	}
}
