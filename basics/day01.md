# Java 基础知识


## 计算机基础知识

### 01. 计算机概述 (了解)

### 02. 软件开发和计算机语言概述 (了解)

### 03. 人机交互 (了解)

### 04. 键盘功能键和快捷键 (掌握)

### 05. 如何打开DOS控制台 (掌握)

### 06. 常见的DOS命令讲解


## Java 语言基础

### 07 Java语言概述 (了解)

#### Java 语言发展史

* 詹姆斯·高斯林 (James Gosling)
* SUN (Stanford University Network，斯坦福大学网络公司)
* Java 咖啡 -> 咖啡生产地 印尼爪哇岛

#### Java 语言版本

* JAVA SE 5.0 (1.5.0) Tiger     老虎
* JAVA SE 5.1 (1.5.1) Dragonfly 蜻蜓
* JAVA SE 6.0 (1.6.0) Mustang   野马
* JAVA SE 7.0 (1.7.0) Dolphin   海豚

#### Java 语言平台

* J2SE(Java 2 Platform Standard Edition) 标准版
  * 为开发普通桌面和商务应用程序提供的解决方案，是其他两者的基础
* J2ME(Java 2 Platform Micro Edition) 小型版
  * 为开发电子消费产品和嵌入式设备提供的解决方案
* J2EE(Java 2 Platform Enterprise Edition) 企业版
  * 为开发企业级应用提供的一套解决方案，包含 Servlet Jsp 等，主要针对于 Web 应用程序开发

#### Java 语言特点

* 简单性
* 解释性
* 面向对象
* 高性能
* 分布式处理
* 多线程
* 健壮性
* 动态
* 结构中立
* 安全性
* 开源
* 跨平台

### 08 Java语言跨平台原理 (掌握)

只要在需要运行 Java 应用程序的操作系统上，先安装一个 Java 虚拟机(JVM，Java Virtual Machine)即可。由 JVM 来负责 Java 程序在该系统中的运行。

### 09. JRE 和 JDK 的概述 (掌握)

* JRE 包括 Java 虚拟机 和 Java程序所需的核心类库等，只需要安装 JRE 即可运行开发好的 Java程序。
* JDK 提供给 Java开发人员使用的，除了 JRE 还包含了 Java的开发工具(javac jar 等)

### 10. JDK 的下载和安装过程 (了解)

### 11. JDK 安装路径下的目录解释 (了解)

* a:bin目录：该目录用于存放一些可执行程序。
	* 如javac.exe（java编译器）、java.exe(java运行工具)，jar.exe(打包工具)和* javadoc.exe(文档生成工具)等。
* b:db目录：db目录是一个小型的数据库。
	* 从JDK 6.0开始，Java中引用了一个新的成员JavaDB，这是一个纯Java实现、开源的数据库管理系统。这个数据库不仅轻便，而且支持JDBC 4.0所有的规范，在学习JDBC 时，不再需要额外地安装一个数据库软件，选择直接使用JavaDB即可。
* c:jre目录："jre"是 Java Runtime Environment 的缩写，意为Java程序运行时环境。此目录是Java运行时环境的根目录，它包括Java虚拟机，运行时的类包，Java应用启动器以及一个bin目录，但不包含开发环境中的开发工具。
* d:include目录：由于JDK是通过C和C++实现的，因此在启动时需要引入一些C语言的头文件，该目录就是用于存放这些头文件的。
* e:lib目录：lib是library的缩写，意为 Java 类库或库文件，是开发工具使用的归档包文件。
* f:src.zip文件：src.zip为src文件夹的压缩文件，src中放置的是JDK核心类的源代码，通过该文件可以查看Java基础类的源代码。

### 12. Java 开发工具介绍 (了解)

* 基础班：先 notepad，然后 Editplus，再 Eclipse。
* 就业班：MyEclipse 和 Eclipse 都用。

### 13. HelloWorld 案例的编写和运行 (掌握)

* 定义类
* 写 main 方法
* 写输出语句
* Java程序开发运行与工作原理
* 编译和运行程序

```java
class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}
```

### 15. Java语言的书写格式(约定俗成) (掌握)

* 大括号要对齐,并且成对写
* 左大括号前面有空格
* 遇到左大括号要缩进
* 方法和程序块之间加空行让程序看起来清晰
* 并排语句之间加空格，如 for 语句
* 运算符两侧加空格

### 16. Path 环境变量的作用及配置方式 (掌握)

* 先配置 JAVA_HOME
* 再改 Path，注意 Path 是有先后顺序关系的

### 18. CLASSPATH 环境变量的作用及其配置 (了解)

Path 和 CLASSPATH 的区别
  * Path 配置的是可执行文件路径
  * CLASSPATH 配置的 Java类文件，也就是 .class 文件

### 20. 注释概述及其分类 (掌握)

注释的作用
  * 解释说明程序
  * 帮助我们调试错误

### 21. 关键字的概述和使用 (掌握)

* 什么是关键字
  * 被 Java语言赋予特定含义的单词
* 关键字的特点
  * 组成关键字的字母全部小写
* 常见关键字
  * public static void class 等
* 关键字的注意事项
  * goto 和 const 作为保留字存在，但目前没有使用

### 22. 标识符的概述和组成规则 (掌握)

* 什么是标识符 - 就是给类、接口、方法、变量等起名字时使用的字符序列
* 标识符的组成规则 - 英文大小写字母`A-z` + 数字字符`0-9` + `$` 和 `_`
* 标识符注意事项 - 不能使用关键字 + 不能数字开头 

### 23. 标识符中常见的命名规则 (了解)

* 见名知意
* 包 - 最好是域名倒过来，要求所有的字母小写 
* 类或者接口 - 每个单词首字母大写 (大驼峰)
* 方法或者变量 - 第一个单词小写，后续单词首字母大写 (小驼峰)
* 常量 - 所有字母大写，多个单词用下划线分隔

### 24. 总结 + 作业

* 第一个 HelloWorld 多敲几遍背下来
* System.out.print(); 和 System.out.println(); 的区别是什么
* 标识符的命名规则注意事项?
* 练习下载 JDK，下载最新版本和历史版本
