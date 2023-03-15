class TrunkCall
{
 double duration;
 double charge;
 TrunkCall()
 {
  duration = 0;
 }
 TrunkCall(double d)
 {
  duration = d;
 }
 void calcCharge()
 {
  System.out.println("no policy");
 }
}

class OridinaryCall extends TrunkCall
{
 double call_rate;
 OridinaryCall()
 {
  super();
  call_rate=0.6;
 }
 OridinaryCall(double d)
 {
  super(d);
  call_rate=0.6;
 }
 OridinaryCall(double d,double f)
 {
  super(d);
  call_rate=f;
 }
 void  calcCharge()
 {
  charge = duration*call_rate;
  System.out.println("OridinaryCall:" +charge);
 }
}

class UrgentCall extends TrunkCall
{
 double call_rate;
 UrgentCall()
 {
  super();
  call_rate=1.0;
 }
 UrgentCall(double d)
 {
  super(d);
  call_rate=1.0;
 }
 UrgentCall(double d,double f)
 {
  super(d);
  call_rate=f;
 }
 void calcCharge()
 {
  charge = duration*call_rate;
  System.out.println("UrgentCall:" +charge);
 }
}

class LightingCall extends TrunkCall
{
 double call_rate;
 LightingCall()
 {
  super();
  call_rate=1.2;
 }
 LightingCall(double d)
 {
  super(d);
  call_rate=1.2;
 }
 LightingCall(double d,double f)
 {
  super(d);
  call_rate=f;
 }
 void calcCharge()
 {
  charge = duration*call_rate;
  System.out.println("For LightingCall charge:"+charge);
 }
}

class Telephone
{
 public static void main(String args[])
 {
  TrunkCall tref;
  OridinaryCall ordCall = new OridinaryCall(4);
  tref = ordCall;
  tref.calcCharge();
  
  UrgentCall urgCall = new UrgentCall(1.0,2.0);
  tref = urgCall;
  tref.calcCharge();
  
  LightingCall ligCall = new LightingCall(2.0,3.0);
  tref = ligCall;
  tref.calcCharge();
  
 }
}
