package Package;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String countryName = scanner.nextLine();

        TimeZone timeZone = TimeZone.getTimeZone(countryName);
        ZoneId countryZone = timeZone.toZoneId();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime countryDateTime = localDateTime.atZone(countryZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a z");
        String formattedDateTime = countryDateTime.format(formatter);
        System.out.println("Current time in " + countryName + ": " + formattedDateTime);
    }
}
