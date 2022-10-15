import java.util.Random;
public class while_random_dice {

  public static void main(String[] args) {
    Random rand = new Random();

    int x = 0;
    int y = 0;

    while(x != 6){
      x = rand.nextInt(6) + 1;
      y += 1;
      System.out.format("%s\n",x);
    }

    System.out.format("6が出るまでサイコロを%s回ふりました。\n", y);

  }
}