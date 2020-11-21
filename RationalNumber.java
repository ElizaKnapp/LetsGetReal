public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber (int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0) {
      numerator = nume * -1;
      denominator = deno * -1;
      reduce();
    }
    else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue() {
    return (double)numerator / (double)denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }

  public boolean equals(RationalNumber other) {
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b) {
    if (b == 0) return Math.abs(a);
    else return gcd(b, a % b);
  }

  private void reduce() {
    int oldNume = numerator;
    int oldDeno = denominator;
    numerator = numerator / gcd(oldNume, oldDeno);
    denominator = denominator / gcd(oldNume, oldDeno);
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber ans = new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    return ans;
  }

  public RationalNumber divide(RationalNumber other) {
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other) {
    int newNume = numerator * other.getDenominator() + other.getNumerator() * denominator;
    int newDeno = denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(newNume, newDeno);
    return ans;
  }

  public RationalNumber subtract(RationalNumber other) {
    int newNume = numerator * other.getDenominator() - other.getNumerator() * denominator;
    int newDeno = denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(newNume, newDeno);
    return ans;
  }

}
