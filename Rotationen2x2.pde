float phi = 0;

void setup()
{
  fullScreen(P2D);
  
  // size(800, 800);
  print("pixelWidth: ", pixelWidth, "\n");
  print("pixelHeight: ", pixelHeight, "\n");
  
  // scale(0.9, 0.9);
  
  background(255);
  stroke(0);
  fill(127);
  
  frameRate(24);
  // noLoop();
}

void drawPolygon(Point p[])
{
  // stroke(0);
  //  fill(0);
  final float s = 1; // 400;
  beginShape();
  for(int i = 0; i < p.length; i++)
  {
    vertex(s * p[i].x, s * p[i].y);
  }
  endShape();
}

void draw()
{
  int dimension = min(width, height);
  translate(width/2, height/2);
  scale(dimension / 2, dimension / 2);
  strokeWeight(0.02);
  
  final float k = 0.2;
  Point p[] = {
     new Point(1, 0),
     new Point(k, k),
     new Point(0, 1),
     new Point(-k, k),
     new Point(-1, 0),
     new Point(-k, -k),
     new Point(0, -1),
     new Point(k, -k),
     new Point(1, 0),
  };
  
  phi += PI / 36;
  float s = (float) Math.sin(1.5 * phi);
  fill(144 + (int) 72 * s);

    
  Matrix2x2 left = Matrix2x2.rotate(phi);
  Matrix2x2 right = Matrix2x2.scale(s);
  Matrix2x2 m = Matrix2x2.multiply(left, right);
  
  for(int i = 0; i < p.length; i++)
  {
    p[i].transform(m);
  }
  
  drawPolygon(p);
}