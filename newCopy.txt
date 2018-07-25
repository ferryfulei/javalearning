import java.io.*;
class CopyFile{
  public static void main(String[] args) {
    int i;
    if(args.length != 2){
      System.out.println("Usage: CopyFile from ... to ...");
      return;
    }
    try(FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1])){
      do {
        i = fin.read();
        System.out.print(i);
        if(i != -1) fout.write(i);
      } while (i != -1);
      System.out.println("complete");
    }catch(IOException exc){
      System.out.println(exc);
    }
  }
}
