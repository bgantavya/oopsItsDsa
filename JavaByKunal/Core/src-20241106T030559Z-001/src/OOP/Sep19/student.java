package OOP.Sep19;

public class student {
    String name;
    int age;
    int roll_no;
    student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no  = roll_no;
    }
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void intro() {
        System.out.println("name is " + name + " and age is " + age);
    }
    public void say_hi(String name) {
        System.out.println(this.name+" says hi to "+name);
    }
    static {
        System.out.println("message from static block of student.java");
    }
}
