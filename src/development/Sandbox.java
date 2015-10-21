package development;
import java.util.*;
public class Sandbox {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
int q1_num1 = (int) (10 + Math.random()*89);
int q1_num2 = (int) (10 + Math.random()*89);
int q1_num3 = q1_num1 + q1_num2;
int q2_num1 = (int) (1000 + Math.random()*8999);
int q2_num2 = (int) (100 + Math.random()*899);
int q2_num3 = q2_num1 - q2_num2;
int q3_num1 = (int) (10 + Math.random()*39);
int q3_num2 = (int) (10 + Math.random()*39);
int q3_num3 = (int) (10 + Math.random()*89);
int q3_num4 = (int) (q3_num1 + q3_num2) * q3_num3;
int q4_num1 = (int) (10 + Math.random()*39);
int q4_num2 = (int) (10 + Math.random()*39);
int q4_num3 = (int) (1 + Math.random()*8);
int q4_num4 = (int) (10 + Math.random()*89);
int q4_num5 = (q4_num1 + q4_num2) * (q4_num3 - q4_num4);
int q1_correct  = 5;
int q1_wrong    = 0;
int q2_correct  = 10;
int q2_wrong    = 2;
int q3_correct  = 17;
int q3_wrong    = 7;
int q4_correct  = 26;
int q4_wrong    = 15;
int point_total = 0;
switch (point_total) {
case 0: 
			System.out.println(q1_num1 + " + " + q1_num2 + " = ");
			int q1_ans = input.nextInt();
			if (q1_ans == q1_num3) {
				
				System.out.println("That is correct. You have earned " + q1_correct + " points.");
				System.out.println("You now have " + (point_total = point_total + q1_correct) + " points.");
			}else{
				System.out.println("Wrong... You have earned " + q1_wrong + " points.");
				System.out.println("You now have " + (point_total = point_total + q1_wrong) + " points.");
				}
case 2:
			System.out.println(q2_num1 + " - " + q2_num2 + " = ");
			int q2_ans = input.nextInt();
			if (q2_ans == q2_num3) {
			
				System.out.println("That is correct. You have earned " + q2_correct + " points.");
				System.out.println("You now have " + (point_total = point_total + q2_correct) + " points.");
			}else{
				System.out.println("Wrong... You have earned " + q2_wrong + " points.");
				System.out.println("You now have " + (point_total = point_total + q2_wrong) + " points.");
				}
			}
			
}

		














		
	}

