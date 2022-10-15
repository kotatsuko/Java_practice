public class for_sum {

  public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);
    int y =0;

    for(int i = 1; i <= x; i++){
      y += i;
    }

    System.out.format("1から%sまでの整数の合計は%sです。\n", x , y);

  }
}