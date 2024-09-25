interface OOPsFlightEnabled054B { // abstract modifier here is redundant because it is implicit
  double MILES_TO_KM = 1.60934;
  double KM_TO_MILES = 0.621371;

  public abstract void takeOff(); // if changed to protected / private, then you are reducing the scope - not allowed
  abstract void land(); // implicitly declared public abstract
  void fly(); // implicitly declared public abstract
}
