package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		int totalSimulations = in.nextInt();
			while (startAmount<= 50)
			{
		if (Math.random() > winChance)
		{
			System.out.println("ruin");
		startAmount = startAmount -1;
		}
		else
		{
			System.out.println("success");
		startAmount = startAmount + 1;
		}
		}
	}

}
