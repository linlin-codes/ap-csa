/**Christian Lin
 * 2/18/23
 */

import java.util.Scanner;
public class SignNine {
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
if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
|| (day.equals("Friday")) && (hour >= 8 && hour <= 15)) {
System.out.println("You cannot park here on school days, make sure to drive the speed limit of 15mph, bye bye");
return;
}

else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
|| (day.equals("Friday")) && (hour >= 16 && hour <= 18)) {
System.out.println("You may park here for one hour");
}

else if (day.equals("Saturday") || day.equals("Sunday")) {
System.out.println("You may park here for one hour only");
}
}
}

