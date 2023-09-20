import java.util.*;
public class Bee3089 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
	    int i, valor[], n=1, sx=0, sm=0;
	    n=s.nextInt();
	    while(n!=0) {
	    	valor=new int[2*n];
	    	for(i=0; i<valor.length; i++) valor[i]=s.nextInt();	
	    	sx=valor[0]+valor[(2*n)-1];
	    	sm=valor[n]+valor[n-1];
	    	if(sx>=sm)  System.out.println(sx+" "+sm);
	    	else System.out.println(sm+" "+sx);	   	
	    	n=s.nextInt();
	    }
			s.close();
	}
}