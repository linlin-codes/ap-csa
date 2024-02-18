/**Christian Lin
*/
public class LetterViewer {

public static void main(String[] args) {
PennDraw.setFontSize(100.0);
PennDraw.enableAnimation(30);

while (true) {
String s = "";

if (PennDraw.hasNextKeyTyped()) {
s += PennDraw.nextKeyTyped();
PennDraw.clear();
}

PennDraw.text(0.5, 0.5, s);
PennDraw.advance();

}
}
}
