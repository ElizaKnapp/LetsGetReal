public abstract class Number {
  public abstract double getValue();

  public boolean equals(Number other) {
    if (RealNumber.getValue() == 0 && other.getValue() == 0) {
      return true;
    }
    else if (percentDifference(other.getValue(), RealNumber.getValue()) < 0.001) {
      return true;
    }
    else return false;
  }
}
