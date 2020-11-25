import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Bibliotek extends PApplet {

Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!");
Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!");

int sum;
int terningeKast;

public void setup() {
   

  buttonTerning6.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 6));
      sum += terningeKast;
    }  
  }
  );

  buttonTerning10.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 10));
      sum += terningeKast;
    }
  }
  );
}

public void draw() {
  clear();
  buttonTerning6.display();
  buttonTerning10.display();
  fill(255);
  textAlign(CENTER);
  text("Du har kastet " + terningeKast, width/2, 200);
  text("Samlet sum    " + sum, width/2, 250);
  text("Slå med 6 terning", width/6, 40);
  text("Slå med 10 terning", width/1.20f, 40);
}

public void mousePressed() {
  buttonTerning6.click();
  buttonTerning10.click();
}
  
interface Action{

 public void execute();

}
class Button{

float x, y, w, h;
String navn;
Action a;

Button(float x, float y, float w, float h, String navn){
this.x=x;
this.y=y;
this.w=w;
this.h=h;
this.navn=navn;

}

public void addAction(Action a){
this.a=a;
}

public void display(){
  fill(220,220);
  rect(x,y,w,h); 



}

  public void click(){
  if((mouseX>x)&&(mouseX<x+w)&&(mouseY>y)&&(mouseY<y+h)){
  a.execute();
  }
  
  }
  
  }
  public void settings() {  size(500, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Bibliotek" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
