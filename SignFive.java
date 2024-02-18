/**Christian Lin
 * 2/18/23
 */

import java.util.Scanner;
public class SignFive {
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

if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
|| (day.equals("Friday") && standing.equals("yes") && hour >= 7 && hour <= 10) || hour >= 14 && hour <= 19) {
System.out.println("No standing here");
return;
}

if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
|| (day.equals("Friday") && commercial.equals("yes") && hour >= 10 && hour <= 14)) {
System.out.println("Commercial vehicles may park here for 3 hours");
return;
}

if (day.equals("Saturday") && hour >= 9 && hour <= 19) {
System.out.println("You may park here");
return;
}
else {
System.out.println("You may park here");
}
}
}
}