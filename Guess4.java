class Guess4{
  public static void main(String args[])
    throws java.io.IOException{
      char ch, ignore, answer = 'K';
      do {
            System.out.println("I am thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");
            ch = (char) System.in.read();

            if(ch == answer) System.out.println("**right**");
            else {
              System.out.print("...Sorry, you are");
              if(ch < answer) System.out.println("too low");
              else System.out.println("too high");
              System.out.println("Try again \n");
            }
      }while(ch != answer);
    }
}
