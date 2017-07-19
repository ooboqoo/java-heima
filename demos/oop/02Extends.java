class Extends {
  public static void main(String[] args) {
    Zi z = new Zi();
  }
}

class Fu {
  static {
    System.out.println("静态代码块Fu");
  }

  {
    System.out.println("构造代码块Fu");
  }

  public Fu() {
    System.out.println("构造方法Fu");
  }
}

class Zi extends Fu {
  static {
    System.out.println("静态代码块Zi");
  }

  {
    System.out.println("构造代码块Zi");
  }

  public Zi() {
    System.out.println("构造方法Zi");
    super();
  }
}