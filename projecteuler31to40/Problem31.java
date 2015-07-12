package projecteuler31to40;

import java.util.Date;

class level31{
	void solve2(){//11秒13毫秒
		int num=200;
		int result=0;
//		i+2*j+5*a+10*b+20*c+50*d+100*e+200*f
		for(int a=0;a<=200;a++){
			for(int b=0;b<=200;b+=2){
				for(int c=0;c<=200;c+=5){
					for(int d=0;d<=200;d+=10){
						for(int e=0;e<=200;e+=20){
							for(int f=0;f<=200;f+=50){
								for(int g=0;g<=200;g+=100){
									for(int h=0;h<=200;h+=200){
										if(a+b+c+d+e+f+g+h==200)
											result+=1;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(result);
	}
	
	void solve(){//25秒662毫秒
		
		int num=200;
		int result=0;
		for(int i=0;i<=200;i++){
			for(int j=0;j<=100;j++){
				for(int a=0;a<=40;a++){
					for(int b=0;b<=20;b++){
						for(int c=0;c<=10;c++){
							for(int d=0;d<=4;d++){
								for(int e=0;e<=2;e++){
									for(int f=0;f<=1;f++){
									if(i+2*j+5*a+10*b+20*c+50*d+100*e+200*f==200){
										result+=1;
									}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(result);//可以200的一张的
	}
}
public class Problem31 {


	public static void main(String[] args){
		Date beginTime=new Date();
		new level31().solve();//73682
		Date endTime=new Date();
		long Time=endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"秒"+Time%1000+"毫秒");
	}

}
