package jlab;
public class fstpatt{
	public static void main(String[] args) {double c=0,f=2;int v;
	for(int i=0;i<5;i++) {c=i;
	v=(int)Math.pow(f, c);//2,4,6
		for(int j=1;j<=i;j++) {
			if(j==1)System.out.print("  ="+1);
			if(v>1) {
				//System.out.print(" * ");
				int r=v;
				while(r!=0){
						 r-=2;
						if(r>0)System.out.print("  +"+r);
					}
				System.out.print("  "+1);
			}
				
			}System.out.println();
		}
	
	}
}
