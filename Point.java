
class Point {
  float x, y, w;
  Point(float x, float y) { this.x = x; this.y = y; this.w = 1; }
  
  public void transform(Matrix2x2 m)
  {
    float newx = m.m[0] * x + m.m[1] * y;
    float newy = m.m[2] * x + m.m[3] * y;
    x = newx;
    y = newy;
  }
  
  public void transform(Matrix3x3 m)
  {
    float newx = m.m[0] * x + m.m[1] * y + m.m[2] * w;
    float newy = m.m[3] * x + m.m[4] * y + m.m[5] * w;
    float neww = m.m[6] * x + m.m[7] * y + m.m[8] * w;
    x = newx;
    y = newy;
    w = neww;
  }
}