package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOdd {
 
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		int initialValue,;
		initialValue = in.nextInt();
		 = in.nextInt();
		int checkNumber = initialValue;
		List<Integer> resultList = new ArrayList<>();
		while(checkNumber < -1){
			checkNumber++;
			if(!((checkNumber)%2==0)){
				resultList.add(checkNumber);
			}
		}
		System.out.println(resultList);
	}
	
}
