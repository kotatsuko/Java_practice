public class if_small_num {

  public static void main(String[] args) {

    int y = Integer.parseInt(args[0]);
    int z = Integer.parseInt(args[1]);
    int x = y < z ? y : z ;



    System.out.format("[%s] と [%s] でより小さいのは [%s] です。\n",
      y, z, x);
  }
}