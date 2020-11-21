public class Tester {
  public static void main(String[] args) {
    //rationalnumber subtraction testing
    RationalNumber num = new RationalNumber(3, 4);
    RationalNumber other = new RationalNumber(4, 5);
    System.out.println(num.subtract(other));

    //constructor testing
    RationalNumber t1 = new RationalNumber(-8, 5);
    System.out.println(t1);

  }
}
