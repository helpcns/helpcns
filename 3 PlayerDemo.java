class Player 
{
 String name;
 int age,matches,ranking;
 Player(String n,int a,int m, int r)
 {
  name = n;
  age = a;
  matches = m;
  ranking = r;
 }
}
class Cricket_Player extends Player
{
 int Higest_Score,Bat_average,Bowl_average;
 Cricket_Player(String a,int b,int c,int d,int e,int f,int g)
 {
  super(a,b,c,d);
  Higest_Score = e;
  Bat_average = f;
  Bowl_average = g;
 }
 void disp()
 {
  System.out.println("name:" +name);
  System.out.println("age:" +age);
  System.out.println("no of matches:" +matches);
  System.out.println("higest score:" +Higest_Score );
  System.out.println("batting:" +Bat_average);
  System.out.println("bowling:" +Bowl_average);
  System.out.println("ranking:" +ranking);
 }
}

class PlayerDemo
{
 public static void main(String args[])
 {
  Cricket_Player C = new Cricket_Player("Dhoni",40,600,83,7,4,1);
  C.disp();
 }
}
