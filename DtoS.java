import java.io.*;
class DtoS{
  public static void main(String[] args) throws IOException{
    String s;
    BufferedReader br = new BufferedReader(new FileReader("test.txt"));
    while((s = br.readLine()) != null) System.out.println(s);
    br.close();
    }
}
