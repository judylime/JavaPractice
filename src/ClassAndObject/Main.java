package ClassAndObject;

public class Main {
    public static void main(String[] args) {
        Student tom = new Student("Tom",23,3.8, true); // declaration
        System.out.print(tom.name);
        System.out.print(tom.age);
//        tom = null; //NullPointerException
        tom.debug();
        Student jerry = new Student("jerry");
        jerry.debug();
        tom.sayHello(jerry);
    }
}

class Student {
    //attributes and behavior
    //attributes = fields = member variables = instance variables
    String name;
    int age;
    double gpa; // 3.0
    boolean enrolled;
//    member 特有的 initialize - 0假空
//  byte short int long float double  char    boolean    reference type
//    0    0    0    0    0.0   0.0    '0'      false       null

//    constructor 如果没有定义，java会默认一个constructor
//    constructor is special function,可以有多个
    public Student(String name, int age, double gpa, boolean enrolled) { //一定要有public，没有返回，名字要和class相同
        this.name = name; // name就近原则，传进来的name
        this.age = age;
        this.gpa = gpa;
        this.enrolled = enrolled;
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { // void 设计 是因为edit 不需要返回
        this.name = name;
    }
    //behavior
    public void sayHello() {
        System.out.println("Hello, I'm " + this.name); // 可以不用this。this object(student) der name
    }

    public void sayHello(Student peer) { // overloading 重载
        System.out.println("Hello " + peer.name + " I'm " + name);
    }

    public void debug() {
        System.out.print("name is: " + name + " age is " + age  + " gpa is " + gpa + " enrolled is " + enrolled);
    }
}

