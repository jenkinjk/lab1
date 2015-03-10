package madScientist;

import java.util.Scanner;

public class MadScientist {

	public static void main(String[] args) {
		Scanner inScan = new Scanner(System.in);
		int count = inScan.nextInt(), i=1, j,num1= inScan.nextInt(), num2;
		while(count!=0){
			i=1;
			for(j=0;j<num1;j++){
				System.out.print(i+" ");
			}
			for(i = 2; i < count+1; i++){
				num2 = inScan.nextInt();
				for(j=0;j<(num2-num1);j++){
					System.out.print(i+" ");
				}
				num1=num2;
			}
			System.out.println();
			count = inScan.nextInt();
			if(count!=0){
				num1= inScan.nextInt();
			}
		}
		inScan.close();


	}

}
