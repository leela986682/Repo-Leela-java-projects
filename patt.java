/*
 *
package jlab;
import java.lang.Math;
public class patt {
	
}
1//0
1  1//2
1  2  1//4
1  3  3  1//8
1  4  6  4  1//16
*/
package jlab;
public class patt{
	public static void main(String[] args) {
		int [][] a=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) { a[i][j]=1;System.out.print("  "+a[i][j]);}
				else {
					a[i][j] = a[i-1][j-1]+a[i-1][j]; 
					System.out.print("  "+a[i][j]);
				}
			}System.out.println();
		}
	}
}
