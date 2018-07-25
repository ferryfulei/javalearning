class Phone{
  public static void main(String args[]){
    String numbers[][] = {
      {"Tom", " 555"},
      {"Mary", "9989"},
      {"Jon", "1037"},
      {"Rachel", "10293"}
    };
    int i;
    if (args.length != 1) {
      System.out.println("Usage: java Phone <name>");
    }else{
      for (i = 0; i < numbers.length; i++ ) {
        if (numbers[i][0].equals(args[0])) {
          System.out.println(numbers[i][0] + ": " + numbers[i][1]);
          break;
        }
      }
      if (i == numbers.length) {
        System.out.println("Numbers not found");
      }
    }
  }
}
