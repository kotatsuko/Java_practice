public class action_construct {
  public static void main(String[] args) {

    if(args.length == 0){
      constructor c1 = new constructor();
    } else if(args.length == 1) {
      constructor c2 = new constructor(args[0]);
    } else if(args.length == 2) {
      constructor c3 = new constructor(args[0],args[1]);
    }


  }
}