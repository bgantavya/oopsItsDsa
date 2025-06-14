package OOP.Inheritance;

class parent {
    int a = 10;
    int b = 20;
    public void f1() {
        System.out.println("i m f1 in parent");
    }
    public void f2() {
        System.out.println("i m f2 in parent");
    }
}
class child extends parent{
    int a = 100;
    int c = 200;
    public void f1() {
        System.out.println("i m f1 in child");
    }
    public void f3() {
        System.out.println("i m f3 in child");
    }
}

public class inheritance_{
    public static void main(String[] args) {
        parent p1 = new child();
        System.out.println(p1.a);
        System.out.println(p1.b);
        System.out.println(((child)(p1)).a);
        System.out.println(((child)(p1)).c);
        p1.f1();
        p1.f2();
        ((child)(p1)).f3();
    }
}