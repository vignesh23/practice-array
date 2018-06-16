package practice;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		String X="x";
		String O="o";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N:");
		n=s.nextInt();
		System.out.println("Enter M:");
		m=s.nextInt();
		System.out.println("\n");
		boolean XFlag=true;
		String dataArray[][]=new String[n][m];
		int i,j=0,k,l,c;
		//top left
		for(int m1=0;m1<c;m1++){
		for( i=0;i<n;i++){
			dataArray[i][j]=X;
		}
		//left 
		for( i=;i<n;i++){
			dataArray[i][j]=X;
		}
		//bottom
		for( i=0;i<n;i++){
			dataArray[i][j]=X;
		}
		//up
		for( i=0;i<n;i++){
			dataArray[i][j]=X;
		}
		}
			
			
			
//			for(int j=0;j<m;j++){
//				if(XFlag){
//					dataArray[i][j]=X;
//					XFlag=false;
//				}else{
//					dataArray[i][j]=O;
//					XFlag=true;
//				}
//			}
//		}
		for( i=0;i<n;i++){
			for( j=0;j<m;j++){
				System.out.println(dataArray[i][j]+"\t");
			}
			System.out.println("\n");
		}



		System.out.println("Struct : I Love India");
	}

}
