import java.io.*;
class AvgNums{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    int n;
    double sum = 0.0;
    double avg,t;
    str = br.readLine();
    n = Integer.parseInt(str);
    for (int i = 0; i < n ; i++ ) {
      str = br.readLine();
      try{
        t = Double.parseDouble(str);
      }catch(NumberFormatException exc){
        System.out.println("Format error");
        t = 0.0;
      }

      sum += t;
    }
    avg = sum/n;
    System.out.println(avg);
  }
}
