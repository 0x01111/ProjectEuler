package projecteuler21to30;
import java.util.Vector;

public class Launcher {

	public static void main(String[] args) {
        Vector<Integer> loop=new Vector<Integer>();   
   
		int n =1;  
		int size=0;
		int max=0;
		int d=0;
		for(int i=2;i<1000;i++){
			
			while(n<i){
				n*=10;
				}
			while(n>=i){
				n=n%i;
				if(n==0){
					n=1;				
					}
				loop.add(n);
				if(n==loop.get(0)&&loop.size()>1){
					size=loop.size()-1;
					break;
				}
				while(n<i){
					n*=10;					
				}

				if(loop.size()==i-1){
					break;
				}
			
			}
			n=1;
			if(max<size){
				max=size;
				d=i;
			}
			
			loop.removeAllElements();
			
		}
		System.out.println(d);	

	}
}
	