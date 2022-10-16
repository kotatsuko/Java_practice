public class format {
  public static void main(String[] args) {
    human yamada = new human();
    System.out.println("名前は" + yamada.name +"で、年齢は" + yamada.age + "です。");
    
    human sato = new human("佐藤" , 25);
    System.out.println("名前は" + sato.name +"で、年齢は" + sato.age + "です。");
  }
}

