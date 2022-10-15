public class if_large_num {

  public static void main(String[] args) {

    int x ;
    int y = Integer.parseInt(args[0]);
    int z = Integer.parseInt(args[1]);

    if ( y > z ) {
      x = y;
    }
    else {
      x = z;
    }


    System.out.format("[%s] と [%s] でより大きいのは [%s] です。\n",
      y, z, x);
  }
}