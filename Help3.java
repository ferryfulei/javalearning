class Help3{
    public static void main(String args[])
      throws java.io.IOException{
        char choice, ignore;
        for (; ; ){
          do{
          System.out.println("Help on: ");
          System.out.println("1. if");
          System.out.println("2. switch");
          System.out.println("Choose one: ");
          choice = (char) System.in.read();
          do {
            ignore = (char) System.in.read();
          } while (ignore != '\n');
        }while(choice < '1' | choice > '5' & choice != 'q');
        if (choice == 'q') break ;
        System.out.println("\n");
        switch (choice){
          case '1':
            System.out.println("The if: \n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            break;
          case '2':
            System.out.println("The switch: \n");
            System.out.println("switch(expresssion) {");
            System.out.println("  case constant: ");
            System.out.println("    statement sequence");
            System.out.println("    break;");
            System.out.println("}");
            break;
          case '3':
            System.out.println("The for: \n");
            System.out.print("for(int; condition;iteration)");
            System.out.println("statement;");
            break;
          case '4':
            System.out.println("The while:\n");
            System.out.println("while(condition) statement");
            break;
          case '5':
            System.out.println("The do-while:\n");
            System.out.println("do{");
            System.out.println("  statement");
            System.out.println("}while(condition);");
            break;
          case '6':
            System.out.println("The break:\n");
            System.out.println("break; or break label;");
          case '7':
            System.out.println("The continue:\n");
            System.out.println("continue; or continue label;");
        }
      }
      }
}
