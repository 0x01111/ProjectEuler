package projecteuler01to10;

public class Problem4 {

	static boolean JudgeisPalindromic(long num){
		int[] a=new int[100];
		int i=0;
		while(num!=0){
			a[i]=(int) (num%10);
			num=num/10;
//			System.out.print(a[i]+" ");
			i++;
		}
		int j;
		for( j=0;j<i/2;j++){
			if(a[j]==a[i-j-1]){
				continue;
			}else{
				break;
			}
		}
		if(j==i/2) return true;
		else return false;
	}
	public static void main(String[] args){
		//找出两个三位数的乘积的最大的回文数

		//小于 998001 的回文数 且能拆成两个三位数的乘积
		int num=999*999;
		while(num>=100*100){
			if(JudgeisPalindromic(num)){
			for(int i=999;i>=100;i--){
				if(num%i==0&&100<=(num/i)&&(num/i)<=999){
					System.out.print(i+"*"+num/i+"="+num);
					return;
				}
			}
		}
		num--;//906609
		}
}
}
