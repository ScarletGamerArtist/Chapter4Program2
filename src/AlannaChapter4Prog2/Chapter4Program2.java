package AlannaChapter4Prog2;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 10/18
 */
public class Chapter4Program2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to input three integers. 
			System.out.println("Please enter three numbers. (integers): ");
				int num1 = input.nextInt();
				int num2 = input.nextInt(); 
				int num3 = input.nextInt(); 
		
		//If statements for the non decreasing order. Increasing. 
				//num1 - num2 - num3
				if(num1 < num2 
						&& num1 < num3 
						&& num2 < num3 
						) {
					System.out.println(num1+" "+num2+" "+num3);
						//display the integers in a non decreasing order. 
				}
				//num1 - num3 - num2
				else if (num1 < num2
						&& num1 < num3
						&& num2 > num3
						){
					System.out.println(num1+" "+num3+" "+num2);
				}
				//num2 - num3 - num1
				else if (num1 > num2
						&& num1 > num3
						&& num3 > num2) {
					System.out.println(num2+" "+num3+" "+num1);
				}
				//num2 - num1 - num3
				else if (num3 > num1
						&& num3 > num2
						&& num1 > num2) {
					System.out.println(num2+" "+num1+" "+num3);
				}
				//num3 - num2 - num1
				else if (num1 > num2
						&& num1 > num3
						&& num2 > num3) {
					System.out.println(num3+" "+num2+" "+num1);
				}
				//num3 - num1 - num2
				else if (num2 > num1
						&& num2 > num3
						&& num1 > num3) {
					System.out.println(num3+" "+num1+" "+num2);
				}
		
		
		
				
		


	}

}
