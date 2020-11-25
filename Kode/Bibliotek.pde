Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!");
Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!");

int sum;
int terningeKast;

void setup() {
  size(500, 300); 

  buttonTerning6.addAction(new Action() {   
    public void execute() {
      terningeKast = int(random(1, 6));
      sum += terningeKast;
    }  
  }
  );

  buttonTerning10.addAction(new Action() {   
    public void execute() {
      terningeKast = int(random(1, 10));
      sum += terningeKast;
    }
  }
  );
}

void draw() {
  clear();
  buttonTerning6.display();
  buttonTerning10.display();
  fill(255);
  textAlign(CENTER);
  text("Du har kastet " + terningeKast, width/2, 200);
  text("Samlet sum    " + sum, width/2, 250);
  text("Slå med 6 terning", width/6, 40);
  text("Slå med 10 terning", width/1.20, 40);
}

void mousePressed() {
  buttonTerning6.click();
  buttonTerning10.click();
}
  
