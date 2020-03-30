import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Time {
	
	public static void main(String args[]) {
		
		System.out.println("*** WORLD CLOCK ***");
		
		System.out.println("Please choose a timezone: ");
		System.out.println("London [1]: ");
		System.out.println("Paris [2]: ");
		System.out.println("Copenhagen [3]: ");
		
		Scanner scanner = new Scanner(System.in);
		Integer choice = scanner.nextInt();
		
		System.out.println("Your choice was: " + choice);
		
		ZoneId timeZone;
		if(choice == 1) {
			timeZone = ZoneId.of("Europe/London");
		} else if(choice == 2) {
			timeZone = ZoneId.of("Europe/Paris");
		} else if(choice == 3) {
			timeZone = ZoneId.of("Europe/Copenhagen");
		} else {
			timeZone = ZoneId.of("Europe/London");
		}
		
		Clock utcClock = Clock.systemUTC();
		Instant instant2 = Instant.now(utcClock);
		ZonedDateTime convertedInstant = instant2.atZone(timeZone);
		
		System.out.println("The time is: " + convertedInstant.toString());
		
	}
	
}
