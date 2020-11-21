public class RealNumber {
  private double value;

  public RealNumber (double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return "" + getValue();
  }

  public boolean equals(RealNumber other) {
    if (value == 0 && other.getValue() == 0) {
      return true;
    }
    else if (percentDifference(other.getValue(), value) < 0.001) {
      return true;
    }
    else return false;
  }

  public double percentDifference(double newNum, double oldNum) {
    double ans = newNum - oldNum;
    return Math.abs((ans / oldNum) * 100);
  }

  public RealNumber add(RealNumber other) {
    RealNumber ans = new RealNumber(value + other.getValue());
    return ans;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber ans = new RealNumber(value * other.getValue());
    return ans;
  }

  public RealNumber divide(RealNumber other) {
    RealNumber ans = new RealNumber(value / other.getValue());
    return ans;
  }


}
