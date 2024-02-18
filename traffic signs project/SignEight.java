/**Christian Lin
 * 2/18/23
 */

import java.util.Scanner;
public class SignEight {
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

if  ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") && (hour >= 18 && hour <= 22
))) {
System.out.println("You may park here for 2 hours");
return;
}

else if ((day.equals("Friday") || day.equals("Saturday")) && (hour >= 18 && hour <= 0)) {
System.out.println("You may park here for 2 hours");
return;
}

else if ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") && (hour >= 22 && hour <=2))) {
System.out.println("You may park here for 4 hours");
return;
}

else if ((day.equals("Saturday") || day.equals("Sunday")) && (hour >= 0 && hour <= 7)) {
System.out.println("Do not park here, your vehicle will be towed away");
return;
}

else if ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") ||
day.equals("Saturday") || day.equals("Sunday") && (hour >= 4 && hour <= 7))) {
System.out.println("Do not park here, your car will be towed away");
return;
}
}
}
