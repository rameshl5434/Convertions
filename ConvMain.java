package pack;

import java.util.Scanner;

class ConvMain {
	double meters, inches, foot;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"please enter \"1\" for convertion from meters \n  \"2\" for convertion from feet \n \"3\" for convertion from inch");
		int d = sc.nextInt();
		ConvCal so = new ConvCal();
		switch (d) {
		case 1: {
			System.out.println("Enter Meter");
			double meters = sc.nextDouble();
			so.fromMeters(meters);
			break;
		}
		case 2: {
			System.out.println("Enter foot");
			double foot = sc.nextDouble();
			so.fromfoot(foot);
			break;
		}
		case 3: {
			System.out.println("Enter Inch");
			double inch = sc.nextDouble();
			so.frominch(inch);
			break;
		}

		default: {
			System.out.println("Entered convertion is wrong");
		}

		}// switch end

	}

}
