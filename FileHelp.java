import java.io.*;
class Help{
  String helpfile;
  Help(String name){
    helpfile = name;
  }
  boolean helpOn(String what){
    int ch;
    String topic, info;
    try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
      do {
        ch = helpRdr.read();
        if (ch == '#') {
          topic = helpRdr.readLine();
          if (what.compareTo(topic) == 0) {
            do {
              info = helpRdr.readLine();
              if (info != null) {
                System.out.println(info);
              }
            } while (info != null && info.compareTo("") != 0);
            return true;
          }
        }
      } while (ch != -1);
    }catch(IOException exc){
      System.out.println(exc);
      return false;
    }
    return false;
  }
  String getSelection() {
    String topic = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      topic = br.readLine();
    }catch(IOException exc){
      System.out.println("Error reading console");
    }
    return topic;
  }
}
class FileHelp{
  public static void main(String[] args) {
    Help helpobj = new Help("helpfile.txt");
    String topic;
    System.out.println("try the help system" + "enter 'stop' to end");
    do {
      topic = helpobj.getSelection();
      if (!helpobj.helpOn(topic)) {
        System.out.println("topic not found");
      }
    } while (topic.compareTo("stop")!= 0);
  }
}
