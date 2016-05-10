class Matrix2x2 {
  float m[];
  
  public static Matrix2x2 rotate(float phi) {
    float m[] = { (float) Math.cos(phi), (float) -Math.sin(phi), (float) Math.sin(phi), (float) Math.cos(phi) };
    
    return new Matrix2x2( m );
  }
  
  public static Matrix2x2 scale(float s) {
    float m[] = { s, 0, 0, s };
    return new Matrix2x2( m );
  }
  
  public static Matrix2x2 identity() {
    float m[] = { 1.0f, 0, 1.0f, 0 };
    return new Matrix2x2( m );
  }
  
  public Matrix2x2(float m[])
  {
    this.m = new float[4];
    
    for(int i = 0; i < m.length; i++)
    {
      this.m[i] = m[i];
    }
  }
  
  public static Matrix2x2 multiply(Matrix2x2 left, Matrix2x2 right)
  {
    float m[] = {
      left.m[0] * right.m[0] + left.m[1] * right.m[2],
      left.m[0] * right.m[1] + left.m[1] * right.m[3],
      left.m[2] * right.m[0] + left.m[3] * right.m[2],
      left.m[2] * right.m[1] + left.m[3] * right.m[3]
    };
    return new Matrix2x2( m );
  }
}