package inclassCoding.W4D1;

public class Monitor {
  private double length;
  private double width;

  public Monitor(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getLength(){
    return this.length;
  }

  public void setLength(double length){
    this.length = length;
  }

  public double getWidth(){
    return this.width;
  }

  public void setWidth(double width){
    this.width = width;
  }
}
