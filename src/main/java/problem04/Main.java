package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int 	count 	= 0;
		int		S		= 0,
				B		= 0,
				O		= 0;
		int[] 	arr 	= null;
		Scanner sc 		 = new Scanner(System.in);
		int 	inputNum = Integer.parseInt(sc.nextLine());
		int 	ranNum   = (int) Math.random();
		
		while(true) {
		for (int i = 0; true; i++) {
			arr[i] = ranNum;
			
			for(int j = 0; true; j++) {
				if(inputNum == ranNum && arr[i] == arr[j]) {
					++S;
					System.out.println("스타라이크");
				}
				else if(inputNum != ranNum) {
					++B;
					System.out.println("볼");
				}else if(inputNum == null)
					++O;
			}
			
		}
	
		
		}
	}
}