public class wrapper { // class
  public static void main(String[] args) {
    // primitives:byte,short...
    // Wrapper Classes, corresponding primitive

    boolean isMale = true; // not an Object
    Boolean isFemale = true; // is an Object reference

    isMale = false;
    if (isMale) {

    }
    if (isFemale.compareTo(isMale) == 0) {

    }
    isFemale = null; // success
    // isMale = null; //error

    int num = 2;
    Integer num2 = 4; // num2 is an object reference
    num2 = null;

    num2 = 1000;
    String s = num2.toString(); // "1000"
    Integer i = Integer.valueOf("123"); // 123
    Integer num3 = 4;
    if (num3.compareTo(3) > 0) {
      System.out.println("num3 is >3");
    }

    char c = 'a';
    Character c2 = 'A';
    char result = Character.toLowerCase('B'); // static method
    Character c3 = Character.valueOf('s');
    Character c4 = 's';

  }
}
