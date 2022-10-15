public class switch_print {

  public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);
    
    switch (x) { 
    case 1:
      System.out.println("1が入力されました。"); 
      break;
    case 2:
      System.out.println("2が入力されました。");
      break; 
    default: 
      System.out.println("1,2以外の数字が入力されました。");
    }
    
  }
}