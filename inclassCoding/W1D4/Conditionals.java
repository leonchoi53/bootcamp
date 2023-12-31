package inclassCoding.W1D4;

public class Conditionals {
  public static void main(String[] args) {
    // if, else if, else
    int i = 10;
    if (i > 9) { // asking if i >9, if yes, execute the block of the codes
      System.out.println("i= " + i); // i=10
    }
    // flow control: if-else
    if (i < 8) { // not fulfill
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than or equals to 8");
    }
    // else-if
    if (i > 12) {
      System.out.println("i > 12"); // not executed
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i >= 0"); // executed
    } else {
      System.out.println("i is negative"); // not executed
    }

    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    }
    System.out.println(box);

    int number = 11;
    if (number % 2 == 1) { // checking if number is an odd number
      // do something here
      System.out.println("number is an odd numbeer");
    }
    if (number % 2 == 0) { // checking if number is an even number
      System.out.println("number is an even number");
    }

    // String
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }
    if (str.charAt(4) == 'd') { // false, charAt(4) == 'a'
      System.out.println("yes");
    }
    if (str.length() > 10) {
      System.out.println("length > 10");
    }
    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("What is result now?");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else if (score >= 50) {
      grade = 'E';
    } else {
      grade = 'F';
    }
    System.out.println(grade);

    int age = 65;
    boolean isElderly = age >= 65;

    if (isElderly) {
      System.out.println("yes he is elderly");
    }
    // switch
    // Simple Version
    int dayOfWeek = 3;
    String dayName = "";
    switch (dayOfWeek) { // check if the value equals to the following cases
      case 1:
        dayName = "Monday";
        System.out.println(1);
        break; // exit
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        System.out.println(1);
        break;
      case 4:
        dayName = "Thursday"; 
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
    }
    System.out.println("day name is " + dayName);

    char grade2 = 'B';
    int pockeyMoney = 100;
    switch (grade2){
      case 'A':
      pockeyMoney += 100;
      break;
      case 'B':
      pockeyMoney += 70;
      break;
      case 'C':
      pockeyMoney += 50;
      break;
      case 'D':
      pockeyMoney += 20;
      break;
      default:
      pockeyMoney += 5;
    }
    System.out.println(pockeyMoney);

  }
}
