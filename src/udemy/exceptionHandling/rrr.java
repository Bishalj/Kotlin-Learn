package udemy.exceptionHandling;

public class rrr {

  public static void main(String[] args) {
    System.out.println(execp());
  }

  private static int execp() {
    try{
      throw new IllegalArgumentException("EX1");
    }catch (Exception e){
      System.out.println(2);
      return 2;
    }finally {
      System.out.println(4);
      return 4;
    }
  }
}
