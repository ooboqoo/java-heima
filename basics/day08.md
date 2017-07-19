## 代码块

代码块的分类，根据其位置和声明的不同，可以分为
  * 局部代码块，
  * 构造代码块，位于类定义内，每创建一次对象，都会执行一次，且优先于构造方法执行。因此多个构造方法中相同的代码可提取出来放在此处，但实际应用不多。
  * 静态代码块，代码块前有 `static` 关键字，随着类的加载而加载，且只执行一次，用来给类进行初始化，一般用来加载驱动。静态代码块是优先于 main 主方法执行的。
  * 同步代码块，多线程中讲解

面试的时候会问，实际开发中很少用。

```java
class Student {
  public String name;
  public int age;

  public Student() {
    System.out.println("空参构造");
  }
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("有参构造");
  }

  {
    System.out.println('我是构造代码块');
  }

  static {
    System.out.println('我是静态代码块');
  }
}

class Demo {
  public static void main(String[] args) {
    {                        // 局部代码块，用于限定变量的声明周期
      int x = 10;
      System.out.println(x);
    }

    Student s1 = new Student();
    System.out.println("---------------");
    Student s2 = new Student("张三",23);
  }

  static {
    System.out.println("我是在主方法类中的静态代码块");
  }
}
```


## 继承

好处：提高代码复用性、维护性，让与类之间产生了关系，是多态的前提  
弊端：类的耦合性增强

开发原则：高内聚低耦合

```java
class Dog extends Animal {
  
}
```

### 继承的特点

Java 只支持单继承，不支持多继承；但支持多重继承

A:继承的注意事项
  * a:子类只能继承父类所有非私有的成员(成员方法和成员变量)
  * b:子类不能继承父类的构造方法，但是可以通过super(马上讲)关键字去访问父类构造方法。
  * c:不要为了部分功能而去继承

子父类出现同名的变量只是在讲课中举例子有,在开发中是不会出现这种情况的，子类继承父类就是为了使用父类的成员,那么如果定义了同名的成员变量没有意义了。

### super 与 this

super 能取到父类的属性，this 能取到父类和子类的属性。

子类中所有的构造方法默认都会访问父类中空参数的构造方法，其实：每一个构造方法的第一条语句默认都是：super() Object类最顶层的父类。如果父类没有无参构造方法，子类必须先显示调用 super 方法。


```java
class Demo6_Extends {
  public static void main(String[] args) {
    Son s1 = new Son();
    System.out.println(s1.getName() + "..." + s1.getAge());
    System.out.println("--------------------");
    Son s2 = new Son("张三",23);
    System.out.println(s2.getName() + "..." + s2.getAge());
  }
}

class Father {
  String name;
  int age;

  public Father() {                    // 空参构造
    System.out.println("Father 空参构造");
  }

  public Father(String name,int age) {  // 有参构造
    this.name = name;
    this.age = age;
    System.out.println("Father 有参构造");
  }
}

class Son extends Father {
  public Son() {            //空参构造
    this("王五",25);        //本类中的构造方法
    //super("李四",24);       //调用父类中的构造方法
    System.out.println("Son 空参构造");
  }

  public Son(String name,int age) { //有参构造
    super(name,age);
    System.out.println("Son 有参构造");
  }
}
```

```java
// 加载过程演示
class Extends {
  public static void main(String[] args) {Zi z = new Zi(); }
}

class Fu {
  static { System.out.println("静态代码块Fu"); }     // 1
  { System.out.println("构造代码块Fu"); }            // 3
  public Fu() { System.out.println("构造方法Fu"); }  // 4
}

class Zi extends Fu {
  static { System.out.println("静态代码块Zi"); }     // 2
  { System.out.println("构造代码块Zi"); }            // 5
  public Zi() {
    System.out.println("构造方法Zi");                // 6
    // super();  报错 - 对super的调用必须是构造器中的第一个语句
  }
}
```

### 方法重写

子类重写父类方法时，访问权限不能更低。
静态只能覆盖静态，其实不算重写，多态中再详解。

override 与 overload 的区别：
  * 方法重写，子类中出现了和父类中方法声明一模一样的方法。与返回值类型有关，返回值类型一致
  * 方法重载，本类中出现的方法名一样，参数列表不同的方法。与返回值类型无关

### final 关键字的用法

final 修饰的特点：
  * 修饰类，类不能被继承
  * 修饰变量，变量就变成了常量，只能被赋值一次
  * 修饰方法，方法不能被重写

```java
class Father {
  public static final int NUM = 10;  // final 修饰变量的时候，一般结合 public static 使用
  public final void print() { }
}
```

* final 修饰基本类型，其值不能改变
* final 修饰引用类型，是地址值不能被改变，但对象中的属性可以改变

```java
final int PI = 3.14;
PI = 3.1415;  // 报错
final Person p = new Persion();
p.setName('lili');  // 正常运行
```

final 修饰变量的初始化时机：在对象构造完毕前即可

```java
class Demo { final int PI; public Demo() { PI = 3.14; } }
```

### 作业

1:代码块是什么?代码块的分类和各自特点?
2:静态代码块,构造代码块,构造方法的执行流程?
3:继承概述
4:继承的好处
5:Java中继承的特点
6:Java中继承的注意事项?以及我们什么时候使用继承?
7:继承中的成员访问特点
  A:成员变量
    在子类方法中访问一个变量
  B:成员方法
    在测试类中通过子类对象去访问一个方法
8:继承中构造方法的执行流程?假如父类没有无参构造方法，子类应该怎么办?
9:面试题：
  方法重写和方法重载的区别?方法重载能改变返回值类型吗?
  Overload
  Override

  this关键字和super关键字分别代表什么?以及他们各自的使用场景和作用。
10:继承案例练习
11:final关键字可以干什么?有什么特点?

12:final关键字的面试题?
  A:修饰局部变量
  B:初始化时机