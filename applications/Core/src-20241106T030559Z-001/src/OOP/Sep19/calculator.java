package OOP.Sep19;

public class calculator {
    int num1;
    int num2;
    calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double power(int num1, int num2) {
        return Math.pow(this.num1,this.num2);
    }
    public double powerDouble(double num1, int num2) {
        return Math.pow(this.num1,this.num2);
    }
}
