public class JavaQuest13 {
  // You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
  // You should convert Celsius into Kelvin and Fahrenheit by methods

  // Note that:
  // Kelvin (蘭氏) = Celsius (攝氏) + 273.15
  // Fahrenheit (華氏) = Celsius (攝氏) * 1.80 + 32.00

  // Do not change anything in main method
  public static void main(String[] args) {
    double celsius = 23.56d;
    double[] arr =
        new double[] {Kelvin(celsius), Fahrenheit(celsius)};

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        System.out.println("Temperature in Kelvin is " + arr[i]);
      } else if (i == 1) {
        System.out.println("Temperature in Fahrenheit is " + arr[i]);
      }
    }
  }
  public static double Kelvin(double celsius) {
      return celsius + 273.15;
  }
  
  public static double Fahrenheit(double celsius) {
      return celsius * 1.8 + 32;
  }


}
