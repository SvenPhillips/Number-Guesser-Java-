import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String i = ">";
    int minn = 0;
    int maxn = 100;
    System.out.println("Think of a number between " + minn + " and " + maxn + " and I will try to guess it");
    while(i != "="){
      System.out.println("is the number you are thinking of " + (int)(Math.floor((float)((maxn + minn) / 2))));
      System.out.println("type > if i guessed low, < if i guessed high, and = if i guessed correctly");
      i = sc.nextLine();
      if(i.equals(">")){
        minn = (int)(Math.floor((float)((maxn + minn) / 2)));
      }
      else if(i.equals("<")){
        maxn = (int)(Math.floor((float)((maxn + minn) / 2)));
      }
      else if(i.equals("=")){
        System.out.println("the number was " + (int)(Math.floor((float)((maxn + minn) / 2))));
        System.exit(0); 
      }
      else{
        System.exit(0);
      }
    }
  }
}
