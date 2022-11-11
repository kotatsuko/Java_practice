public class exception{
  public static void main(String[] args){
    int x = 0;
    int y = 100;
  
    if(args.length > 0)
      try{
        y = Integer.parseInt(args[0]);
      }catch(Exception e){
        System.out.println(e.toString());
        System.exit(0);
      };
    for(int i = 1; i <= y; i++){
      x += i;
    }
    System.out.println("1~" + y + "total:" + x);
  }
}