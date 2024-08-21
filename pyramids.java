package jlab;

public class pyramids {
	public static void main(String args[]) {
		int n = 10;
		for(int i=0;i<=n/2;i++){
            for(int j=0;j<n;j++){
                if(i>=j||i+(j-n/2)>=(n/2))System.out.print(" + ");
                else System.out.print("   ");
            }System.out.println();
        }
	}

}
