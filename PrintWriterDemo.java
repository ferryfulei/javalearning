import java.io.*;
public class PrintWriterDemo{
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out,true);
    int i = 10;
    double d = 123.64;
    pw.println("Using a PrintWriter");
    pw.println(i);
    pw.println(d);
  }
}
