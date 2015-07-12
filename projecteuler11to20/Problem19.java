package projecteuler11to20;

import java.util.Date;
class level19{
	void solve(){
		int starYear=1900;
		int endYear=2000;
		int sumSunday=0;
		int DaysMonth=0;
		int DaysYear=0;
		for(int year=starYear;year<=endYear;year++){
			for(int month=1;month<=12;month++){
				if(year==1900 && month==1){
					sumSunday=0;
				}else{
					DaysMonth=DaysYear+getDaysMonthFirst(year,month);
					if(year>=1901 && DaysMonth%7==0){
						sumSunday+=1;
					}
//					System.out.println(DaysMonth+" :"+DaysMonth%7 +":"+getDaysMonthFirst(year,month)+":"+getYearDays(year));
				}
			}
			DaysYear=DaysYear+getYearDays(year);
//			System.out.println("New Year");
		}
		System.out.println("1901-2000年每月的第一天是周日的个数："+sumSunday);
	}
	int getDaysMonthFirst(int year,int month){
		int days=0;
		int months[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month>=3&&JudgeLeapYear(year)==true){
			months[2]+=1;
		}
		for(int i=0;i<month;i++){
			days+=months[i];
		}
		days+=1;
		return days;
	}
	int getYearDays(int year){
//		int months[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		boolean flag=JudgeLeapYear(year);
		if(flag==true){
			return 366;
		}else{
			return 365;
		}
	}
	boolean JudgeLeapYear(int year){
		boolean flag=false;
		if (year%400 == 0 || (year%4 == 0 && year%100 != 0)){
			flag=true;
		}
		return flag;
	}
}
public class Problem19 {

	public static void main(String[] args){
		Date beginTime=new Date();
		new level19().solve();//171
		Date endTime=new Date();
		long Time = endTime.getTime()-beginTime.getTime();
		System.out.println("Time:"+Time/1000+"秒"+Time%1000+"毫秒");
	}
}
