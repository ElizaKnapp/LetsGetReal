public class Tester {
  public static void main(String[] args) {
    /*
    Things that need to be tested:
    [DONE] Does the RationalNumber/RealNumber constructor work?
    [DONE] Does getValue work for each?
    Does toString work?
    Does equals work in Number.java (so realNumber) AND in RationalNumber.java?
    RealNumber: add, subtract, mulitply, divide
    RationalNumber: reciprocal, add, subtract, multiply, divide
    */
    int totalScore = 100;
    if (RealConstructorAndGetValueTester() != 100) {
      System.out.println("ERROR: RealNumber Constructor and GetValue");
      totalScore -= 10;
    }
    if (RationalConstructorAndGetValueTester() != 100) {
      System.out.println("ERROR: RationalNumber Constructor, GetValue, GetNumerator and GetDenominator");
      totalScore -= 10;
    }
    if (toStringTester() != 100) {
      System.out.println("ERROR: toString " + toStringTester());
      totalScore -= 10;
    }

    System.out.println(totalScore + " out of 100");

  }

  public static int RealConstructorAndGetValueTester() {
    int score = 100;
    for (int i = 0; i < 10; i++) {
      double holder = Math.random() * i;
      RealNumber tester = new RealNumber(holder);
      if (tester.getValue() != holder) {
        score -= 10;
      }
    }
    return score;
  }

  public static int RationalConstructorAndGetValueTester() {
    int score = 100;
    //if denominator is 0
    RationalNumber tester1 = new RationalNumber(5, 0);
    if (tester1.getNumerator() != 0 || tester1.getDenominator() != 1) {
      score -= 10;
    }
    //if the negative is in the denominaotr
    RationalNumber tester2 = new RationalNumber(8, -7);
    if (tester2.getNumerator() != -8 || tester2.getDenominator() != 7) {
      score -= 10;
    }
    RationalNumber tester3 = new RationalNumber(-14, -6);
    if (tester3.getNumerator() != 7 || tester3.getDenominator() != 3) {
      score -= 10;
    }
    //if it's normal
    for (int i = -5; i < 5; i++) {
      int numerator = (int)(Math.random() * 10 * i);
      RationalNumber tester = new RationalNumber(numerator, 5);
      if (tester.getValue() != numerator / 5.0) {
        score -= 10;
      }
    }
    return score;
  }

  public static int toStringTester() {
    int score = 100;
    //RealNumber first
    for (int i = -5; i < 5; i++) {
      double holder = i * Math.random();
      RealNumber tester = new RealNumber(holder);
      if (!tester.toString().equals("" + holder)) {
        score -= 1;
      }
    }
    //now RationalNumber
    RationalNumber tester1 = new RationalNumber(0, 1);
    if (!tester1.toString().equals("0")) {
      score --;
    }
    RationalNumber tester2 = new RationalNumber(5, 1);
    if (!tester2.toString().equals("5")) {
      score --;
    }
    RationalNumber tester3 = new RationalNumber(5, -6);
    if (!tester3.toString().equals("-5/6")) {
      score --;
    }
    RationalNumber tester4 = new RationalNumber(-9, 3);
    if (!tester4.toString().equals("-3")) {
      score --;
    }
    return score;
  }


}
