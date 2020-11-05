# JAVA学习

## 面向对象那个的三大特性

### 封装性
某类中的某个属性可以在外部程序中随意访问，导致数据的不安全性
封装的好处：

 1. 对外提供简单操作入口。不需关注内部原理

 2. 封装之后才会形成真正的“对象”

 3. 可以重复使用。并且适应性强

 4. 提高安全性

封装的步骤
 1. 所有属性私有化，使用private关键字修饰。
```java
public class User{
	private int age;
}
```
 2. 对外提供简单操作入口。（get/set）
 3. set 方法命名规范：
`public void set+属性首字母大写(形参){}`
 4. get 方法命名规范：
`public void get+属性首字母大写(形参){}`
```java
public class User{
	private int age;
	public int getAge(int a){
		return age;
	}
	public void setAge(int a){
		age = a;
	}
}
```
**注意**：
 1. setter and getter方法没有static关键字。
 2. 有static关键字修饰的方法调用：类名.方法名(实参);
 3. 没有static关键字修饰的方法调用: 引用.方法名(实参);
### 继承性

#### 继承的基本作用

- 代码复用。最**重要**的作用是：有了继承才有了以后**方法的覆盖**和**多态机制**。

#### 继承的语法

```
[修饰符列表] class 类名 extends 父类名{
	类体 = 属性 + 方法
}
```

**注意**

- java只支持单继承，不能同时继承很多类。

  - 可以间接继承其他类

    ```java
    C extends B{}
    B extends A{}
    A extends T{}
    ```

    这里的C类直接继承B类，但是间接继承T A B类

- 一些术语：

  - B类继承A类：
    - A类：父类、基类、超类、superclass
    - B类：子类、派生类、subclass

#### 继承的数据

- 私有的不支持继承
- 构造方法不支持继承
- 其他都可以继承
- java语句中假设一个类没有显示的继承任何类，该类默认继承JavaSE库中的java.lang.Object类。

### 多态性

#### 几个概念

- 向上转型 upcasting  / 自动类型转化
  - 子转为父
- 向下转型 downcasting  / 强制类型转换
  - 父转为子
- **记忆**：无论向上还是向下，两种类型之间必须要有继承关系

#### 多态语法

Cat类继承自Animal类

```java
Animal a = new Cat(); // 向上转型
a.move(); //编译可以通过，这里的move来自Animal类。编译的这个过程叫做静态绑定
//在程序运行阶段，JVM堆内存中真实创建的对象是Cat对象，那么就会调用Cat中的move方法
```

父类型引用指向子类型对象这种机制导致程序在编译阶段绑定和运行阶段绑定两种不同的形态/状态，称为一种多态语法机制

**如果方法是子类型中特有的方法，则需要进行强制类型转换**

```java
Animal a = new Cat(); // 向上转型
a.move();

Cat c = (Cat) a;// 强制类型转换
```

**注意以下代码**

```java
Animal a = new Bird();
Cat c = (Cat) a;
```

Bird 和 Cat都是Animal的子类，该代码在编译阶段不会报错，但是在堆内存里，只有Bird类型的对象，运行的过程中会出现错误。ClassCastException异常，类型转换异常，总是在“向下转型”的错误中出现。

**避免ClassCastException异常**

使用instanceof运算符

- 语法格式：`引用 instanceof 数据类型名`
- 运算符执行结果是Boolen类型`
  - `a instanceof Animal`
  - True：a这个引用指向的对象是一个Animal类型
  - False：a这个引用指向的对象不是一个Animal类型

```java
Animal a = new Bird();
if (a instanceof Cat){
    Cat c = (Cat) a;
}
```

#### 作用

- 降低程序的耦合度，提高程序的扩展力。

**核心**

- 面向抽象编程，尽量不要面向具体编程

## 构造方法
 1. 构造方法又被称为 构造函数/构造器

 2. 构造方法与法结构：
	 	[修饰符列表] 构造方法名(形式参数列表){
	 		构造方法体；
	 	}
	
 3. 对于构造方法来说，没有返回类型，也不能写void

 4. 构造方法名与类名相同

 5. 构造方法的作用：
      通过构造方法的调用，可以创建对象。
      创建对象的同时，初始化实例变量的内存空间。
      
 6. 构造方法的调用：
		`new 构造方法(实参列表)`
	
 7. 构造方法有返回值么？
	返回构造方法所在类的类型。
	
 8. 当类中没有定义任何构造方法，会有缺省构造器。

 9. 当一个类显式的提供带参构造方法后，系统不再提供无参构造方法。

 10. 构造方法可以重载。

 11. 成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能有实例变量。

      *实例变量的内存空间是在构造方法执行过程中完成开辟的。系统在默认幅值的时候也是在构造方法执行过程中完成的。*

## 对象和引用

1. Java内存划分：

   ​	堆区：存放对象实例

   ​	栈区：方法执行的内存

   ​	方法区：存储已被虚拟机加在的类信息、常量、静态变量。

2. 对象和引用的概念：

   * 对象：在使用new云算符在堆内存中开辟的内存空间成为对象
   
   * 引用：是一个变量。引用保存了内存地址，指向了堆内存当中的对象。
   
   * 所有访问实例相关的数据，都需要通过“引用.”的方式访问，因为只有通过引用才能找到对象。
   
   * 只有一个空的引用，访问对象的实例相关的数据会出现空指针异常。

3. 参数的传递
* 实参是类对象的话，类似于传递指针

## this关键字

this 在对象内部，指向自身

this 是一个引用，存储在JVM堆内存Java对象内部。

**没有static关键字的方法被称为“实例方法”**

**没有static关键字的变量被称为“实例变量”**

**当一个行为/动作执行的过程当中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不要带static关键字**

在定义实例方法的时候，调用内部变量的时候，需要采用“引用.”的方法来访问该变量，但是对于不确定引用的情况下，用this来引用自己。
this可以出现在“实例方法”中，this指向当前正在执行这个动作的对象。

带有static的方法，在执行的过程中，不需要对象的参加。执行过程中不存在“当前对象”，自然也不存在this

不能省略this的情况：

* 用来区分局部变量和实例变量的时候

* 调用别的构造方法，不创建新的对象

   ```java
  //无参构造
  public Data(){
      this(1970,1,1);//该语法必须出现在第一行
  }
  //有参构造
  public Data(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
  }
  ```

  

## static关键字

`static String country;` 

* 静态变量，在类加载的时候初始化，不需要创建对象，内存就开辟了。
* 静态变量存储在*方法区*内存当中。

### 什么时候成员变量声明为**实例**变量？

- 所有对象都有该属性，但是该属性值会随着对象的变化而变化

### 什么时候成员变量声明为**静态**变量？

- 所有对象都有该属性，并且所有对象的这个属性的值都是一样的，节省内存开销。

### 可以使用static关键字定义“静态代码块”：

1. 语法格式：

   ```java
   static{
       java语句;
   }
   ```

2. 静态代码块在类加载时执行，并且只执行一次。
3. 静态代码块在一个类中可以编写多个，并且准寻自上而下的顺序依次执行。
4. 静态代码块的作用：
   - 记录日志
   - 静态代码块为程序员提供了一个特殊时刻，这个特殊时刻被称为类加载时刻。

5. 通常在静态代码块中完成预备工作，先完成数据的准备工具，例如：初始化连接池，解析XML配置文件。。

### 实例语句/代码块

1. 语法格式：

```java
{
    java语句;
}
```

2. 在构造方法之前执行。

3. 执行时机：构造初始化时机

### 方法什么时候定义为静态的？

1. 所有对象具有相同的动作，并且产生相同的结果。

 	2. 某些工具类，为了方便使用。例如Math，print

## 方法的覆盖

- 重载
  - overload
  - 同一个类，完成的功能是相似的
  - 在同一个类，相同的方法名，不同参数列表，完成方法重载
  - 重载和方法返回类型无关，和修饰符列表无关

- 覆盖
  - 方法重写，override
  - 父类中的方法已经无法满足子类的需求时，需要重新编写方法
  - 方法重写发生在具有继承关系的父子类之间；方法名相同，返回值类型相同，形参列表相同；访问权限不能比父类低；抛出异常不能比父类多

**注意**

- 私有方法不能继承，所以不能覆盖
- 构造方法不能继承，所以不能覆盖
- 静态方法不存在覆盖
- 覆盖只针对方法，不谈属性

## final关键字

- 表示不可变
- final修饰的类无法被继承
- final修饰的方法无法被覆盖
- final修饰的变量一旦幅值后，不可重新幅值
- final修饰的实例变量，不能采用系统默认值，必须手动赋值，因为一旦赋值不能修改
- final修饰的引用，一旦指向某一个对象后，不能再更改，被指向对象不能被垃圾回收器回收，但是所指对象的内部内存是可以被修改的
- final修饰的实例变量是不可变的，这种变量一般和static一起使用，被称为**常量**

#### 常量定义

`public static final 类型 常量名 = 值;`

- 规范中要求所有常量的名字全部大写，每个单词之间使用下划线连接。

`public static final String GUO_JI = "CHINA";`

## package 和 import

### 包机制

- package，主要是为了方便管理。

#### 定义package

- 在java源程序的第一行上编写package语句
- package只能编写一个语句

#### package的语法

- 语法结构：`package 包名`
- 命名规范：域名 + 项目名 + 模块名 + 功能名；全部小写，必须遵守标识符命名规则
- 一个包对应一个目录，目录间使用"."隔开

#### package运行

- 使用了package之后，类名是：package包 + 类名

例如：`com.jack.javase.test.TestPackage`

- 使用的是相对路径
- 包名类似于声明相对路径，在主程序中使用某个类，首先查找该包下是否存在

### import

- 导入其他包中的类

## 访问控制权限

### 修饰符

- 访问权限控制修饰符来控制元素的访问范围

- 修饰符包括

  - public    公开的，在任何位置都能访问
  - protected   受保护的，同包、子类中可以访问
  - 缺省       同包内可以访问
  - private   私有的，只能在本类中访问

- 可以修饰类、变量、方法

- 当某个数据只希望子类使用，使用protected进行修饰

- 修饰符范围

  ​	private < 缺省 < protected < public

- 类只能使用public 或者 缺省。内部类除外

## 抽象类

### 定义和基本概念

- 类和类之间具有共同特征，将这些类的共同特征提取出来，形成的就是抽象类
- 抽象类也属于引用数据类型
- `[修饰符列表] abstract class 类名{}`

```java
abstract class Account{    //抽象类，无法实例化，只能被继承
}
class CreditAccount extends Account{ //子类继承抽象类
}
```

- 抽象类无法实例化，所以抽象类是用来被继承的

- abstract 和 final不能连用，这两个关键字是对立的

- 抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。

- 抽象方法：

  - 没有实现的方法，没有方法体的方法。

    `public abstract void doSome();`

  - 抽象类中不一定有抽象方法。但抽象方法必须在抽象类中。
  - **非抽象子类继承抽象类后，需要将抽象方法重写覆盖**

- 这里可以使用多态

  ```java
  public class Test{
      public static void main(String[] args){
          Account A = new CreditAccount();//多态。面向抽象编程
      }
  }
  abstract class Account{
      public abstract double charge(int m);
  }
  class CreditAccount extends Account{
      public double charge(int m){// 重写抽象方法
          System.out.println("..." + m);
      }
  }
  ```

  

## 接口

### 基础语法

- 接口也是一种引用数据类型，编译之后也是class字节码文件

- 接口是完全抽象的。（抽象类是半抽象）

- `[修饰符列表] interface 接口名{}`

- 接口支持多继承

  ```java
  interface A{}
  interface B{}
  interface C extends A, B{}
  ```

- 接口中只有：常量、抽象方法

  ```java
  interface MyMath{
      public abstract int sum(int a, int b);//抽象方法
      int sub(int a, int b);//可以省略public abstract
      
      public static final double PI = 3.1415925;//常量
      double i = 10;//public static final可以省略
  }
  ```

- 接口中所有元素都是public修饰的，都是公开的

- 接口的所有方法不能带有方法体

- 类和类之间叫做继承，类和接口之间叫做实现 implements

  ```java
  interface MyMath{
      int sub(int a, int b);
      double i = 10;
  }
  class MyMathImp implements MyMath{ // 非抽象类
      public int sub(int a, int b){ //实现接口方法，必须是public修饰符
          return a-b;
      } 
  }
  ```

- **非抽象类实现接口的时候，必须将接口中的所有方法重写实现**

- 可以使用多态

  ```java
  public class Test{
  	public static void main(String[] args){
      	MyMath mm = new MyMathImp(); //多态
          int res = mm.sub(10,6); // 面向接口编程
  	}
  }
  interface MyMath{
      int sub(int a, int b);
      double i = 10;
  }
  class MyMathImp implements MyMath{ // 非抽象类
      public int sub(int a, int b){ //实现接口方法，必须是public修饰符
          return a-b;
      } 
  }
  ```

- 一个类可以实现多接口，弥补了java中的单继承的缺陷

  ```java
  interface A{}
  interface B{}
  interface C{}
  class D implements A,B,C{}
  ```

- 没有关系的接口之间可以进行强制类型转换，但是在运行的过程中可能会出现ClassCastException异常。

- 继承和实现同时出现：extends在前，implements在后

  ```java
  class Animal{}
  interface Flyable{
      void fly();
  }
  
  class Cat extends Animal implements Flyable{ //继承和实现同时使用
      public void fly(){
          System.out.println("飞猫");
      }
  }
  ```

  

### 作用

- 接口的作用类似于多态：面向抽象编程。降低程序耦合度，提高程序的扩展力。
- 面向接口编程，可插拔
- 接口大多和多态关联在一起
- 接口可以解开调用者和实现者间的耦合关系。调用者面向接口调用，实现者面向接口编写实现
- 在项目中将整个项目模块化，提高开发效率

## 类型和类型的关系is a, has a, like a

### is a

- 凡是满足is a的表示“继承关系”：cat is a animal

  `A extends B`

### has a

- 满足 has a关系的表示“关联关系”：I have a pen

- 通常以“属性”的形式存在

  ```java
  A{
      B b; 
  }
  ```

### like a

- 满足like a关系的表示“实现关系”：cook like a menu

- 通常是类实现接口

  ` A implements B`

## Object类

- 所有类默认继承Object
- 常用方法
  - clone 
  - equals
  - finalize 垃圾回收器调用方法
  - hashCode
  - toString

### toString

```java
public String toString(){
    return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

类名@对象的内存地址转换为16进制

- 作用：将一个java对象转换为字符转表示形式
- **建议所有子类重写该方法**

### equals

```java
public boolen equals(Object obj){
    return (this == obj);
}
```

- 作用：判断两个对象是否相等
- 判断两个数据是否相等可以使用“==”，如果等号两边是对象，则判断对象的内存地址是否相等
- equals源码中采用的是“==”，所以应该重写equals
- String比较两个字符串，应该使用equals
- String类也重写了toString方法

### finalize

- 是被protected修饰的

  ```java
  protected void finalize() throws Throwable{}
  ```

- 该方法不需要手动调用，jvm的垃圾回收器会自动调用，GC负责调用该方法

- 当一个java对象即将被销毁的时候，垃圾回收器负责调用finalize()方法

### hashCode

- 返回对象的哈希值

```java
public native int hashCode();
```

### clone

`a2 = a1`

假设a2想复制a1对象，仅仅使用=的话，只能使得a2和a1指向相同的堆内存，如果该堆内存的内容发生了改变，则双方都发生改变

- 浅拷贝：对只含有基本数据类型的类，进行clone操作，可以使得新对象与就对象之间的值互不干扰。但是如果有属性是内存地址（引用类型），那么拷贝的就是内存地址，该内存地址会受到引用的影响。
- 深拷贝：深拷贝会拷贝所有的属性,并拷贝属性指向的动态分配的内存。当对象和它所引用的对象一起拷贝时即发生深拷贝。深拷贝相比于浅拷贝速度较慢并且花销较大。

## 内部类

### 匿名内部类

- 内部类：在类的内部定义新的类
- 内部类分类：静态、实例、局部

```java
class Test{
    static class Inner1{//静态
    }
    class Inner2{//实例
    }
    public void doSome(){
        class Inner3{}//局部
    }
}
```

- 内部类的代码可读性很差，尽量不要用

```java
interface Compute{
    int sum(int a, int b);
}
class MyMath{
    public void MySum(Compute c, int a, int b){
        int val = c.sum(a,b);
        System.out.println(a + "+" + b + "=" + val);
    }
}
public static void main(String[] args){
    MyMath mm = new MyMath();
    mm.MySum(new Compute(){ //匿名内部类, 并且实现接口
        public int sum(int a, int b){
            return a+b;
        }
    },100,200)
}
```

## 数组

- 是一种引用数据类型，不属于基本数据类型
- 数组可以存储基本或者引用数据类型
- 数组存在堆当中
- 数组如果储存的是对象的话，实际上储存的是对象的引用地址
- 数组一旦创建，长度不可变
- 数组中数据类型统一
- 语法格式

```java
int[] array1;
double[] array2;
boolean[] array3;
String[] array4;
Object[] array5;
```

- 初始化

```java 
int[] array = {100,200,300,55};//静态初始化
int[] array = new int[5];//动态初始化
```

- 数组的扩容：java使用先新建大容量数组，然后拷贝老数组进入新数组，然后删除老数组的方法

## Integer

- intValue() 手动拆箱
- `static int parseInt(String s)` String 转 int

```java
int retValue = Integer.parseInt("123");
```

- 类似的其他类型库也有相关函数

  ```java
  double d = Double.parseDouble("3.14");
  float f = Float.parseFloat("1.0");
  ```

- NumberFormatException 数字格式异常，只能从数字字串转到int

```java
static String toBinaryString(int i); //int --> binary string
static String toHexString(int i); //int --> hex string
static String toOctalString(int i); //int --> octal string
```

```java
static Integer valueOf(int i); // int --> Integer
static Integer valueOf(String s);  // String --> Integer
```

### String int Ineger相互转换

```java
//int --> String
String s = 100 + "";
String s = String.valueOf(100);

//String --> int
int i = Integer.parseInt("100");

//int --> Integer 装箱
int i = 100;
Integer I = i;

Integer I = Integer.valueOf(100);
//Integer --> int 拆箱
Integer I = new Integer(100);
int i = I;

int i = Integer.intValue(I);

//String --> Integer
Integer I = Integer.valueOf("100");

//Integer --> String
String S = String.valueOf(I)
```

## Date

java.util.Data包

- ` Date nowTime = new Date();`
- 要对时间进行格式化需要包 java.text.SimpleDateFormat
- ` SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");`
- 字符串 --> Date

```java
String time = "2008-08-08 08:08:08 888";
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//格式要和字符串格式相同
Date dateTime = sdf.parse(time);
```

- 获取距1970年1月1日0时0分0秒开始的毫秒数

```java
long nowTimeMillis = System.currentTimeMillis();
```

## Random

java.util.Random

```java
Random random = new Random();
int i = random.nextInt();

int j = random.nextInt(bound:101);//[0,100]
```

## Enum

- 也是一种引用类型
- 枚举中的每一个值可以看做是常量

```java
enum Result{
    SUCCESS, FAIL
}

public static Result divide(int a, int b){
    try{
        int c = a / b;
        return Result.SUCCESS;
    }catch(Exception e){
        return Result.FAIL;
    }
}
```

## 异常

- Java异常处理方式：
  - 方法声明位置上，使用throws关键字，异常上抛
  - 使用try...catch语句进行异常捕捉 

```java
public static void doSome() throws ClassNotFoundException{
    //doSome()方法在执行过程中，有可能会出现ClassNotFoundException，属于编译异常
    //编译过程中，会出现编译错误，需要提前对异常进行预先处理。
}
```

```java
try{
    FileInputStream fis = new FileInputStream("D:\\code\\javaLearning\\README.md");
   } catch (IOException e){ //多态： IOException e = new FileNotFoundException();
     	System.out.println("文件不存在");
   }
```

- catch后面可以用具体类型，也可以跟父类型

```java
try{
      FileInputStream fis = new FileInputStream("D:\\code\\javaLearning\\README.md");
      fis.read();  
} catch (FileNotFoundException e){ 
	System.out.println("文件不存在");
}catch (IOException I){
    System.out.println("读取文件错误")
}
```

- 可以使用多个catch，建议使用catch精确得处理
- catch需要按子-->父的类型，从小到大捕捉

```java
String msg = exception.getMessage();//获取异常简单的描述信息
exception.printStackTrace();//打印异常追踪的堆栈信息，是多线程处理的
```

```java
try{
    doSome();
}catch(Exception e){
    e.printStackTrace();
}
```

### finally

- 在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
- 通常在finally语句块中完成资源的释放/关闭
- try...finally

```java
try{
    doSome();
}finally{
    doOther();
}
```

### 自定义异常

```java
public class MyException01 extends Exception{
    //编译时异常
    public MyException01(){}
    public MyException01(String s){
        super(s);
    }
}
public class MyException02 extends RuntimeException{
    //运行时异常
    public MyException02(){}
    public MyException02(String s){
        super(s);
    }
}
```

### 异常方法覆盖

- 重写后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少。

## 集合

### 概述

- 用于容纳其他数据
- 集合不能直接存储基本数据类型，另外集合不能直接存储java对象（集合中存储的是引用）

```java
list.add(100);//此处存在自动装箱 int-->Integer
```

- 在java中每一个不同的集合，底层会对应不同的数据结构，往不同的集合中存储数据，等于将数据放到了不同的数据结构中
- java.util.*
- 存在两种存储方式
  - 以单个元素存储的，超级父类接口：java.util.Collection;
  - 以键值对存储的，超级父类接口：java.util.Map;
- Collection会调用父类Iterable的iterator方法，进行元素迭代。

### 集合类继承关系

- Iterable <-- Collection
- Iterable{ iterator() }
- iterator(){ hasNext(); next(); remove(); }

### List

- 有序可重复，存储的元素有下标
- ArrayList
  - 数组实现
  - **非线程安全**
- LinkedList
  - 双向链表
- Vector
  - 数组实现
  - **线程安全**：所有方法都被`synchronized`修饰，但是效率低

### Set

- 无序不可重复，没有下标
- HashSet
  - HashMap实现

- TreeSet
  - TreeMap实现
  - TreeMap是二叉树