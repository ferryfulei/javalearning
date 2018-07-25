import java.io.*;
class KtoD{
  public static void main(String[] args) throws IOException{
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    FileWriter fw = new FileWriter("test.txt");
    do {
      str = br.readLine();
      if(str.equals("stop")) break;
      str += "\r\n";
      fw.write(str);
    } while (!str.equals("stop"));
    fw.close();
  }
}
