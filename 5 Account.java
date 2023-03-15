package Balance;
public class Account
{
 double principal,rate,balance;
 int time;
 public Account(double pr,int ti,double ra)
 {
  principal = pr;
  time = ti;
  rate = ra;
 }
 public void calcAccount()
 {
  balance = principal*time*rate;
 }
 public void Displaybalance()
 {
  System.out.println("\n\nPrincipal Account:"+principal+"Rs\nTime:"+time+" Year\n\nCurrenr Balance:"+balance+"Rs");
 }
}

**********
creat folder
***********

import Balance.*;
class Demopackage
{
 public static void main(String args[])
 {
  Account acc = new Account(5000,2,3);
  acc.calcAccount();
  acc.Displaybalance();
 }
}

