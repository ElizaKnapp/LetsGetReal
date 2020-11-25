public abstract class Number {
  public abstract double getValue();

  public boolean equals(Number other) {
    if (getValue() == 0 && other.getValue() == 0) {
      return true;
    }
    else if (percentDifference(other.getValue(), getValue()) < 0.001) {
      return true;
    }
    else return false;
  }

  public double percentDifference(double newNum, double oldNum) {
    double ans = newNum - oldNum;
    return Math.abs((ans / oldNum) * 100);
  }

  public int compareTo(Number other) {
    if (equals(other)) return 0;
    else if (getValue() < other.getValue()) return -1;
    else return 1;
  }
}
