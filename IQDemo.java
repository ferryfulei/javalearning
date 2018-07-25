class FixedQueue implements ICharQ{
  private char q[];
  private int putloc, getloc;
  public FixedQueue(int size){
    q  = new char[size];
    putloc = getloc = 0;
  }
  public void put(char ch)
    throws QueueEmptyException{
      if (putloc == q.length) {
        throw new QueueEmptyException();
    }
    q[putloc++] = ch;
  }
  public char get()
    throws QueueFullException{
      if (getloc == putloc) {
      throw new QueueFullException(q.length);
    }
    return q[getloc++];
  }
  }
class CircularQueue implements ICharQ{
  private char q[];
  private int putloc, getloc;
  public CircularQueue(int size){
    q = new char[size+1];
    putloc = getloc = 0;;
  }
  public void put(char ch){
    if (putloc + 1 == getloc|((putloc == q.length -1)&& (getloc == 0))) {
      System.out.println("Queue is full");
      return;
    }
    q[putloc++] = ch;
    if (putloc == q.length) {
      putloc = 0;
    }
  }
  public char get(){
    if (getloc == putloc) {
      System.out.println("Queue is empty");
      return (char) 0;
    }
    char ch = q[getloc ++];
    if (getloc == q.length) {
      getloc =0;
    }
    return ch;
  }
}
class DynQueue implements ICharQ{
  private char q[];
  private int putloc, getloc;
  public DynQueue(int size){
    q = new char[size];
    putloc = getloc =0 ;
  }
  public void put(char ch){
    if (putloc == q.length) {
      char t[] = new char[q.length * 2];
      for (int i = 0;i < q.length ;i++ ) {
        t[i] = q[i];
      }
      q = t;
    }

    q[putloc++] = ch;
  }
  public char get(){
    if (getloc == putloc) {
      System.out.println("queue is empty");
      return (char) 0;
    }
    return q[getloc++];
  }
}
class QExcDemo{
  public static void main(String[] args) {
    FixedQueue q1= new FixedQueue(10);
    char ch;
    int i;
    try{
      for (i = 0;i<11 ;i++ ) {
        System.out.print((char)('A' + i));
        q1.put((char)('A'+i));
        System.out.println("OK");
      }
    }catch(QueueFullException exc){
      System.out.println(exc);
    }
  }
}
