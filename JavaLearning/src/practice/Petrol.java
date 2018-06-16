package practice;
import java.util.Scanner;
class Petrol {
    public static void main(String args[] ) throws Exception {
            Scanner in  = new Scanner(System.in);
            int cases = in.nextInt();
            int count=1;
            while(cases-- > 0){
                int size = in.nextInt();
                int earnings = in.nextInt();
                int[] inputArray = new int[size];
                for(int i=0;i<size;i++){
                    inputArray[i] = in.nextInt();
                }
                int buildingVisited = inputArray[0];
                for(int j=1;j<size;j++){
                    if(inputArray[j] > buildingVisited){
                        buildingVisited = inputArray[j];
                        count++;
                    }
                }
                System.out.println(count*earnings);
            }
    }
}