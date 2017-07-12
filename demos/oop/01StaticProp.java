class StaticProp {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.name = "苍老师";
    p1.country = "日本";
    p1.speak();

    Person p2 = new Person();
    p2.name = "小泽老师";
    p2.speak();

    Person.country = "中国";  // 可以通过类名调用
    System.out.println(Person.country);
    p1.speak();

    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}

class Person {
  String name;
  static String country;

  public void speak() {
    System.out.println(name + "..." + country);
  }
}

