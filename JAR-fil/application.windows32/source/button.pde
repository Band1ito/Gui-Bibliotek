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

void addAction(Action a){
this.a=a;
}

void display(){
  fill(220,220);
  rect(x,y,w,h); 



}

  void click(){
  if((mouseX>x)&&(mouseX<x+w)&&(mouseY>y)&&(mouseY<y+h)){
  a.execute();
  }
  
  }
  
  }
