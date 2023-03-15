class Collision 
{
 String i,j;
 Collision(String a,String b)
 {
  i=a;
  j=b;
 }
void check ()
{
try
{
if(i==(j))
{
System.out.println("The two vehicles are moving in same direction, hence no problem");
}
else
{
throw new Exception("The two vehicles are moving in different directions, so collision occurs");
}
} catch(Exception e)
{
System.out.println(e);
}
}

}
class Exception
{
 public static void main(String args[])
 {
  Collision s = new Collision("north","north");
  Collision n = new Collision("north","east");
  s.check();
  System.out.println();
  n.check();
  System.out.println();
 }
}
