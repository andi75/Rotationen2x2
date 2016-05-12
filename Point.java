
class Point {
  float x, y;
  Point(float x, float y) { this.x = x; this.y = y; }
  
  public void transform(Matrix2x2 m)
  {
    float newx = m.m[0] * x + m.m[1] * y;
    float newy = m.m[2] * x + m.m[3] * y;
    x = newx;
    y = newy;
  }
}