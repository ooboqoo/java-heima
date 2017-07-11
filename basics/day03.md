# Java 语言基础

### 01. 逻辑运算符的基本用法 (掌握)

`&` 与 `|` 或 `^` 异或 `!` 非 `&&` 短路与 `||` 短路或

实际开发中最常用的是 `&&` `||` `!`

### 03. 位运算符的基本用法1 (了解)

* `&` 按位与
* `|` 按位或
* `^` 按位异或
* `~` 按位取反
* `<<` 左移，左边最高位丢弃，右边补齐0
* `>>` 右移，最高位是0，左边补齐0；最高为是1，左边补齐1
* `>>>` 无符号右移，无论最高位是0还是1，左边补齐0

```java
2 << 3;  // 计算 2 * 8 的结果，效率最高的方法
```

### 06. 三元运算符的基本用法 (掌握)

### 08. 键盘录入的基本格式讲解 (掌握)

```java
import java.util.Scanner;

class KeybordInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Integer:");
		int x = sc.nextInt();
		System.out.println(x);
		System.out.println("Input a String:");
		String s = sc.next();
		System.out.println(s);
	}
}
```

### 11. 顺序结构语句 (了解)

### 13. 选择结构 if 语句注意事项 (掌握)

* 比较表达式无论简单还是复杂，结果必须是 boolean 类型
* if 语句控制的语句体如果是一条语句，大括号可以省略；如果是多条语句，就不能省略。建议永远不要省略。
* 一般来说：有左大括号就没有分号，有分号就没有左大括号

```java
if (8)        // 错误，括号内表达式的计算结果必须是 boolean，Java 没有隐式类型转换
  int x = 9;  // 如果省略大括号，只能是一条语句，而左侧实际包含了声明和赋值两个语句，所以编译不通过
              // 错误: 此处不允许使用变量声明，如果编译通过，就存在歧义，x 的作用域范围如何确定？

if (false); {  // 因为有分号，if 语句被提前结束了
    System.out.println("这句始终会执行");
}
```

### 19. 选择结构 switch 语句的格式及其解释 (掌握)

```java
switch(表达式) {
    case 值1：
        语句体1;
        break;
    case 值2：
        语句体2;
        break;
    …
    default：	
        语句体n+1;
}
```

### 21. 选择结构 switch 语句的注意事项 (掌握)

* 表达式可以接受
  * 基本数据类型可以接受 `byte` `short` `char` `int`，不接受 `long` 类型
  * 引用数据类型可以接受 枚举 和 `String`字符串
* case 后面只能是**常量**，不能是变量，而且，多个 case 后面的值不能重复
* default 可以省略吗? - 可以省略，但是不建议，因为它的作用是对不正确的情况给出提示。
* break 可以省略吗? - 如果省略会出现 case 穿透，建议不要省略
* default 一定要在最后吗? - 不是，可以在任意位置，放哪里效果一样，但建议放最后
* switch 语句的结束条件
  * 遇到 break 就结束了
  * 执行到 switch 的右大括号就结束了

### 23. 选择结构 if 语句和 switch 语句的区别 (掌握)

* switch 建议判断固定值的时候用
* if 建议判断区间或范围的时候用
