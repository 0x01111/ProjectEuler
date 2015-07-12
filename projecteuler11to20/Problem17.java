package projecteuler11to20;

import java.util.Date;

class level17{
	void solve(){
	String[] nums={"","one","two","three","four","five","six","seven","eight","nine","ten",
			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
	String[] tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	int total=0;
	for(int i=1;i<20;i++){// 1-19
		total+=nums[i].length();
	}
	for(int i=20;i<100;i++){//20-99
		int ge=i%10;
		int shi=i/10;
		total+=tens[shi].length()+nums[ge].length();
	}
	
	total*=10;//1-99 ��������10�Σ� X(01) X(99)
	for(int i=1;i<10;i++){
		total+=(nums[i].length()+10)*100;// ���������X�ģ���λ 1xy 2xy 3xy -9xy//10�ǣ�hundred and 
		total-=3;//��ȥ3����������λ100 200.��������Ҫand
	}
	total+=11;//1000
	System.out.println("1-1000Ӣ����ĸ�ͣ�"+total);
	}
}
public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date beginTime=new Date();
		new level17().solve();
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time="+Time/1000+"��"+Time%1000+"����");
	}
}
