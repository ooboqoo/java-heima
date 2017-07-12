# 面向对象

### 01. 面向对象思想概述 (了解)

面向对象思想特点
  * 是一种更符合我们思想习惯的思想
  * 可以将复杂的事情简单化
  * 将我们从执行者变成了指挥者

面向对象特征
  * 封装(encapsulation)
  * 继承(inheritance)
  * 多态(polymorphism)

### 02. 类与对象概述 (掌握)

我们如何描述现实世界事物
  * 属性 - 就是该事物的描述信息(事物身上的名词)
  * 行为 - 就是该事物能够做什么(事物身上的动词)

Java 中最基本的单位是类, Java 中用 class 描述事物也是如此
  * 成员变量 - 就是事物的属性
  * 成员方法 - 就是事物的行为

### 10. 成员变量和局部变量的区别 (掌握)

在类中的位置不同
  * 成员变量：在类中方法外
  * 局部变量：在方法定义中或者方法声明上

在内存中的位置不同
  * 成员变量：在堆内存(成员变量属于对象,对象进堆内存)
  * 局部变量：在栈内存(局部变量属于方法,方法进栈内存)

生命周期不同
  * 成员变量：随着对象的创建而存在，随着对象的消失而消失
  * 局部变量：随着方法的调用而存在，随着方法的调用完毕而消失

初始化值不同
  * 成员变量：有默认初始化值
  * 局部变量：没有默认初始化值，必须定义，赋值，然后才能使用。

注意事项：局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则。

### 13. 封装的概述 (掌握)

封装概述
  * 是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。

封装好处
  * 隐藏实现细节，提供公共的访问方式
  * 提高了代码的复用性
  * 提高安全性。

封装原则
  * 将不需要对外提供的内容都隐藏起来。
  * 把属性隐藏，提供公共方法对其访问。

### 15. `this` 关键字的概述和应用 (掌握)

`this` 关键字代表当前对象的引用, 用来区分成员变量和局部变量重名。

```java
class Demo2_Phone {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    p1.setBrand("三星");
    p1.setPrice(5288);

    System.out.println(p1.getBrand() + "..." + p1.getPrice());
    p1.call();
    p1.sendMessage();
    p1.playGame();
  }
}

class Phone {
  private String brand;
  private int price;

  public void setBrand(String brand) {this.brand = brand; }   // 此处的 this. 无法省略
  public String getBrand() {return this.brand; }              // 此处的 this. 可以省略
  public void setPrice(int price) { this.price = price; }
  public int getPrice() { return price; }
  public void call() { System.out.println("打电话"); }
  public void sendMessage() { System.out.println("发短信"); }
  public void playGame() { System.out.println("玩游戏"); }
}
```
