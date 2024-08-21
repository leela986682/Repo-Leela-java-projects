package jlab;
import java.util.Scanner;
class Hell{ 
    public static void topleft(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<=n-1)System.out.print(" * ");
            }System.out.println();
        }
    }public static void topright(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
    }public void botleft(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i>=j)System.out.print(" * ");
            }System.out.println();
        }
    }public void botright(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
    }public void ss(int c){int n=5;
        if(c==1) {
        	if(n<6)n=n*2;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                if(i<=j||i+j>=n-1)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
        }if(c==2) {
        	if(n<6)n=n*2;
      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
        }if(c==3) {
        	if(n<6)n=n*2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
        }
        if(c==4) {if(n<6)n=n*2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
    }if(c==5) {
    	if(n<6)n=n*2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1)System.out.print(" * ");
                else System.out.print("   ");
            }System.out.println();
        }
      }
    }
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
			Hell ob = new Hell();//object created
			
			System.out.print("Enter the pattren type : \n");//print
			
			String s = sc.nextLine();//string scanning
      
			if(s.equals("specialshape"))
			{
			System.out.print("choose the shape from below : \n");
			System.out.print("<1 up pyramid>\n<2 down pyramid>\n<3 left pyramid>\n<4 right pyramid>\n<5       Diamond>\n");
			int c = sc.nextInt();
			ob.ss(c);
			}
			
			System.out.print("Enter the size of pattren : \n");//print 
			
			int n = sc.nextInt();//scan the size 
			
			//System.out.println("s is :"+s);
      
			if(s.equals("topleft")) topleft(n);//calls top left if the condition true
			
			if(s.equals("botleft"))ob.botleft(n);//calls bot left if the condition true
			
			if(s.equals("topright"))topright(n);//calls top right if the condition true
			
			if(s.equals("botright"))ob.botright(n);//calls bot right if the condition true
		}
        
    }
}