import java.util.*;

public class Bee3306b {
    
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		int maior=0,j,x,a,b,v,i,tm=s.nextInt(), qt=s.nextInt(), vet[]=new int [tm];
		for(i=0; i<tm; i++)	{
			vet[i]=s.nextInt();
		}
		for(i=0; i<qt; i++) {
			a=-1; b=-1;
			x=s.nextInt(); a+=s.nextInt(); b+=s.nextInt(); int aux=b-a+1;
			if (x==1) {	
				v=s.nextInt();
				for(j=a; j<=b; j++) vet[j]+=v;				
			}
			else {
				int mdc[]=new int [aux];
				while (a<=b) {
					for(j=0; j<aux; j++ ) {
						mdc[j]=vet[a];
					  if (j==0) maior=mdc[0];
					  else if(mdc[j]>maior) maior=mdc[j];
						a++;	
					}			
				}
				int xx=2, auxm=1, parada=0;
				while (xx<=maior && parada==0) {
					int ct=0; 
					for(j=0; j<aux; j++) {
						if (mdc[j]%xx==0) {
							mdc[j]/=xx;
							ct++;
							if (mdc[j]==1) parada++;
							if (ct==aux) auxm*=xx;
							
						}
				    }					
					if (ct==0) xx++;
				} System.out.println(auxm);
			}			
		}		
		s.close();
	}
}