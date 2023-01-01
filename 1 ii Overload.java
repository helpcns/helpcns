class Shape
{
  double length,breadth,area;
  Shape(double l)
  {
   length =l;
   breadth = l;
  }
  Shape(double l,double b)
  {
   length =l;
   breadth =b;
  }
  void compArea(double l)
  {
   area = l*l;
   System.out.println("Area=" +area+ "units");
  }
  void compArea(double l,double b)
  {
   area = l*b;
   System.out.println("Area=" +area+ "units");
  }
}
class Overload
{
 public static void main(String args[])
 {
  Shape s1 = new Shape(5.00);
  Shape s2 = new Shape(5.00,6.00);
  s1.compArea(8.00);
  s2.compArea(s2.length,s2.breadth);
  s2.compArea(s2.length);
 }
}

