/**Christian Lin
 * 2/18/23
 */

import java.util.Scanner;
public class SignTwo {
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

if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")||day.equals("Sunday") && (hour >= 2 && hour <= 5)) {
System.out.println("You cannot park here, Unlimited parking except for on Monday, Tuesday, Wednesday, and Sunday from 2-5AM");return;
}
else {
System.out.println("Ulimited Parking for you");
}
}
}

