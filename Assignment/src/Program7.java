import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter the speed of car in Km/hr:");
		Scanner scanner=new Scanner(System.in);
		double speed=scanner.nextDouble();
		System.out.println("Enter the starting time in 24:00 format:");
		double time=scanner.nextDouble();
		System.out.println("Enter the stopping time at 24:00format:");
		double time2=scanner.nextDouble();
		double tottime=time2-time;
		System.out.println("Total time taken:"+tottime+"hr");
		double distance=speed*tottime;
		System.out.println("Total distance covered by car is:"+distance+"km");
		scanner.close();
	}

}
