import java.util.Scanner;
class Rectangle
{
 double length,width,area;
 String colour;
 Scanner s= new Scanner(System.in);
  void SetLength()
  {
   System.out.println("enter the length of rectangle");
   length = s.nextDouble();
  }
  void SetWidth()
  {
   System.out.println("enter the width of rectangle");
   width = s.nextDouble();
  }
  void SetColour()
  {
   System.out.println("enter the colour of rectangle");
   colour = s.next();
  }
  void FindArea()
  {
   area = length*width;
  }
  boolean compare(Rectangle a)
  {
   if(colour.equals(a.colour) && area==a.area)
   return true;
   else
   return false;
  }
 }
 class rectDemo
 {
  public static void main(String args[])
  {
   Rectangle r1 = new Rectangle();
   Rectangle r2 = new Rectangle();
   boolean match =  false;
   System.out.println("Rectangle 1:");
   r1.SetLength();
   r1.SetWidth();
   r1.SetColour();
   System.out.println("Rectangle 2:");
   r2.SetLength();
   r2.SetWidth();
   r2.SetColour();
   r1.FindArea();
   r2.FindArea();
   match= r1.compare(r2);
   if(match == true)
   System.out.println("\n matching rectangle");
   else 
   System.out.println("\n not mat6ching rectangle");
  }
 }

