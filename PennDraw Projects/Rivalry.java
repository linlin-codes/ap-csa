/**Christian Lin
*/
import java.lang.Math;
public class Rivalry {    

public static void main(String[] args) {
boolean rivialOneWin = false;
boolean rivialTwoWin = false;

double ONE_PIXEL = 1.0/512;
double red = 2.0;
double blue = 2.0;

//enable animations to 2 frames per second
PennDraw.enableAnimations(2);

//the loop in which the race takes place
while (red < 9 && blue < 9) {
  PennDraw.clear();
  PennDraw.line(0.1, 0.1, 0.1, 0.9);
  PennDraw.line(0.9, 0.1, 0.9, 0.9);
  PennDraw.picture(red/10, 0.2, "Penn.png", 150, 150);
  PennDraw.picture(blue/10, 0.2, "Drexle.png", 150, 150);

  red += Math.random()*0.56;
  blue += Math.random()*0.44;
  PennDraw.advance();
}

PennDraw.AnimationDisable();
if (red >= 9) {
  rivialOneWins = true;
}
else if (blue >= 9) {
  rivialTwoWins = true;
}
else [
  PennDraw.text(0.5, 0.5, "Tie!");
}

if (rivialOneWins == true) {
  PennDraw.text(0.5, 0.5, "Penn Wins!");
}
else if (rivialTwoWins == true) {
  PennDraw.text(0.5, 0.5, "Drexle Wins!");
else {
  PennDraw.text(0.5, 0.5, "Tie!");
}
}
}
  


    
