abstract class TwoShape{
  TwoShape(double w, double h){
    width = w;
    height = h;
  }
  TwoShape(double w){
    width = w = height;
  }
  TwoShape(){
    width = 0;
    height = 0;
  }
  TwoShape(TwoShape ob){
    width = ob.width;
    height = ob.height;
  }
  private double width;
  private double height;
  abstract double area();
  void setWidth(double w) {width = w;}
  void setHeight(double h) {height = h;}
  double getWidth() {return width;}
  double getHeight() {return height;}
  void showDim(){
    System.out.println(getWidth() + " " + getHeight());
  }
}
class Triangle extends TwoShape{
  Triangle(String s, double w, double h){
    super(w,h);
    style = s;
  }
  Triangle(Triangle ob){
    super(ob);
    style = ob.style;
  }
  Triangle(String s, double w){
    super(w);
    style = s;
  }
  Triangle(int i){
    super(i);
  }
  Triangle(String s){
    style = s;
  }
  String style;
  double area(){
    return getWidth() * getHeight()/2;
  }
  void showStyle(){
    System.out.println(style);
  }
}
class ColorTriangle extends Triangle{
  private String color;
  ColorTriangle(String c, String s, double w, double h){
    super(s,w,h);
    color = c;
  }
  String getColor(){return color;}
  void showColor(){
    System.out.println("Color is " + color);
  }
}
class Shapes{
  public static void main(String[] args) {
    TwoShape shapes[] = new TwoShape[2];
    shapes[0] = new Triangle("outlined",8.0,12.0);
    shapes[1] = new Triangle(20);
  }
}
