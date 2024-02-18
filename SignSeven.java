/**Christian Lin
 * 2/18/23
 */

import java.util.Scanner;
public class SignSeven {
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
if ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) &&
(((hour > 9 && hour < 15) && (hour == 15 && minute == 0)) || ((hour >= 18 && minute >= 30) && (hour == 21 && minute == 0)))) {
System.out.println("Please purchase ticket on dash before parking");
return;
}

if (day.equals("Saturday") && hour >= 8 && hour <= 21) {
System.out.println("Please purchase ticket on dash before parking");
return;
}

if (day.equals("Sunday") && hour >= 13 && hour <= 21) {
System.out.println("Please purchase ticket on dash before parking");
return;
}
else {
System.out.println("No parking");
}
}
}
