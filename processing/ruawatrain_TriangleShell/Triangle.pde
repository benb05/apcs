void setup()
{
  size(1000,1000);
  background(0);
}

void draw()
{
  for (int i = 0; i < 30; i++) {
    fill(random(255),random(255),random(255));
    stroke(random(255),random(255),random(255));
    triangle(25*i*cos(i*PI/15)+300,25*i*sin(i*PI/15)+500,25*(i+1)*cos(i*PI/15+PI/15)+300,25*(i+1)*sin(i*PI/15+PI/15)+500,300,500);
    delay(2);
  }
}
