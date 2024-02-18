public class LineDrawingTool {

public static void main(String[] args) {
PennDraw.setPenRadius(0.01);
PennDraw.enableAnimation(30);

double x, y = x = 0.5;

while (true) {
if(PennDraw.mousePressed()){
PennDraw.line(x, y, PennDraw.mouseX(), PennDraw.mouseY());
x = PennDraw.mouseX();
y = PennDraw.mouseY();
}

if (mouseY > (0.5)) {
PennDraw.setPenColor(red);
  }
else {
PennDraw.setPenColor(black);}
}
}
PennDraw.advance();
}
}
}
