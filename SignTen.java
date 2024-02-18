/**Christian Lin
 * 2/18/23
 */

import java.util.Scanner;
public class SignTen {
public static void main (String[] args) {
@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);

System.out.println("What day is today, (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday");
String day = scan.next();
if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday") && 
!day.equals("Saturday") && !day.equals("Sunday")) {
System.out.println("Please enter a valid date");
return;
}

System.out.println("Please enter the time in number of hours from 0 - 23");
int hour = scan.nextInt();
if (hour < 0 || hour > 23){
System.out.println("Please enter a valid time");
return;
}

System.out.println("Please enter the time in number of minutes from 0 - 59");
int minute = scan.nextInt();
if (minute < 0 || minute > 59) {
System.out.println("Please enter a valid time");
return;
}

System.out.println("Is your vehicle a commercial vehicle? Please answer yes or no");
String commercial = scan.next();
if (!commercial.equals("yes") && !commercial.equals("no")) {
System.out.println("Please enter a valid response");
return;
}

if (commercial.equals("no")) {
System.out.println("Are you standing here? Please answer yes or no");
String standing = scan.next();
if (!standing.equals("yes") && !standing.equals("no")) {
System.out.println("Please enter a valid response");
return;
}

if ((commercial.equals("yes")) && (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
|| day.equals("Thursday") || day.equals("Friday")) && (hour >= 7 && hour <= 18)) {
System.out.println("Commerical vehicles may park here for 3 hours, please purchase parking ticket at the Muni-Meter");
}

else if ((hour >= 3 && hour <=6) && (day.equals("Monday") && day.equals("Wednesday")  && day.equals("Friday"))) {
System.out.println("No parking here at night, , please purchase parking ticket at the Muni-Meter");
}

else if ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")|| day.equals("Thursday") 
|| day.equals("Friday")) && (hour >= 18 && hour <= 23 )) {
System.out.println("You may park here for 6 hours, , please purchase parking ticket at the Muni-Meter");
}

else if ((day.equals("Saturday")) && (hour >= 8 && hour <= 23)) {
    System.out.println("You may park here for  6 hours, please purchase parking ticket at the Muni-Meter");
}
}
}
}