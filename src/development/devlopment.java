package development;
import java.util.*;
public class devlopment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Set up the point system
		
		double Q1_correct  = 5;
		double Q1_wrong    = 0;
		double Q2_correct  = 10;
		double Q2_wrong    = 2;
		double Q3_correct  = 17;
		double Q3_wrong    = 7;
		double Q4_correct  = 26;
		double Q4_wrong    = 15;
		double point_total = 0;
		
		
		
		System.out.println("Lets play a math game!");
		System.out.println("I'll ask you four questions and give points based off their difficulty.");
		System.out.println("If you answer correctly you will receive more points.");
		System.out.println("Make sure you do these without pencil or paper, only mental math!\n");
		
		System.out.println("Lets go ahead and start round 1.");
		System.out.println("The first question is:\n");
		
		//Set up the variables for question 1
		double Q1_num1       = 10 + Math.random()*89;
		double Q1_num1_round = Math.round(Q1_num1);
		double Q1_num2       = 10 + Math.random()*89;
		double Q1_num2_round = Math.round(Q1_num2);
		double Q1_num3       = Q1_num1_round + Q1_num2_round;
		
		//Ask question 1 and display results
		System.out.print(Q1_num1_round + " + " + Q1_num2_round + " = ");
		double Q1_answer = input.nextDouble();
			
			do {
			
			if (Q1_answer == Q1_num3) {
				System.out.println("Correct! You have earned " + Q1_correct + " points.");
				System.out.println("You now have " + (point_total = point_total + Q1_correct) + " points.");
			}else{
					System.out.println("Wrong... You receive " + Q1_wrong + " points this round.");
					System.out.println("You now have " + (point_total = point_total + Q1_wrong) + " points.");
				 }
			} while (Q1_answer != Q1_num3);
			
		
		
		System.out.println("Lets move on to round 2.");
		System.out.println("The second question is:\n");
		
		//Set up the variables for question 2
		double Q2_num1       = 1000 + Math.random()*8999;
		double Q2_num1_round = Math.round(Q2_num1);
		double Q2_num2       = 100 + Math.random()*899;
		double Q2_num2_round = Math.round(Q2_num2);
		double Q2_num3       = Q2_num1_round - Q2_num2_round;
		
		//Ask question 2 and display results
		System.out.print(Q2_num1_round + " - " + Q2_num2_round + " = ");
		double Q2_answer = input.nextDouble();
			if (Q2_answer == Q2_num3) {
				System.out.println("Correct! You have earned " + Q2_correct  + " points.");
				System.out.println("You now have " + (point_total = point_total + Q2_correct) + " points.");
			}else{
					System.out.println("Wrong... You receive " + Q2_wrong + " points this round");
					System.out.println("You now have " + (point_total = point_total + Q2_wrong) + " points.");
				 }
					
		
		System.out.println("Lets move on to round 3.");
		System.out.println("The third question is:\n");
		
		//Set up the variables for question 3
		double Q3_num1       = 10 + Math.random()*39;
		double Q3_num1_round = Math.round(Q3_num1);
		double Q3_num2       = 10 + Math.random()*39;
		double Q3_num2_round = Math.round(Q3_num2);
		double Q3_num3       = 10 + Math.random()*89;
		double Q3_num3_round = Math.round(Q3_num3);
		double Q3_num4       = (Q3_num1_round + Q3_num2_round) * Q3_num3_round;
		
		//Ask question 3 and display results
		System.out.print("(" + Q3_num1_round + " + " + Q3_num2_round + ") * " + Q3_num3_round + " = ");
		double Q3_answer = input.nextDouble();
			if (Q3_answer == Q3_num4) {
				System.out.println("Correct! You have earned " + Q3_correct + " points.");
				System.out.println("You now have " + (point_total = point_total + Q3_correct) + " points.");
			}else{
					System.out.println("Wrong... You receive " + Q3_wrong + " points this round");
					System.out.println("You now have " + (point_total = point_total + Q3_wrong) + " points.");
				 }
		
		
		System.out.println("Lets move on to the final round.");
		System.out.println("The fourth and final question is:\n");
		
		//Set up the variables for question 4
		double Q4_num1       = 10 + Math.random()*39;
		double Q4_num1_round = Math.round(Q4_num1);
		double Q4_num2       = 10 + Math.random()*39;
		double Q4_num2_round = Math.round(Q4_num2);
		double Q4_num3       = Math.random()*9;
		double Q4_num3_round = Math.round(Q4_num3);
		double Q4_num4       = 10 + Math.random()*89;
		double Q4_num4_round = Math.round(Q4_num4);
		double Q4_num5       = (Q4_num1_round + Q4_num2_round) * (Q4_num3_round - Q4_num4_round);
		
		//Ask question 4 and display results
		System.out.print("(" + Q4_num1_round + " + " + Q4_num2_round + ") * (" + Q4_num3_round + " - " 
					+ Q4_num4_round + ") = ");
		double Q4_answer = input.nextDouble();
			if (Q4_answer == Q4_num5) {
					System.out.println("Correct! You have earned " + Q4_correct + " points.");
					System.out.println("You have earned a total of " + (point_total = point_total + Q4_correct)
								+ " points.");
			}else{
					System.out.println("Wrong... You have earned " + Q4_wrong + " points.");
					System.out.println("You have earned a total of " + (point_total = point_total + Q4_wrong)
								+ " points.\n");
				 }
			
			System.out.print("Thanks for playing! We should do it again sometime :)");
		
		
	}
}
