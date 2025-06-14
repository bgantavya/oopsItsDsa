public class box {
//     Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions 
// are width, height, depth of double type). The class should have a method that can return volume. 
// Obtain an object and print the corresponding volume in main() function. 
double height;
double depth;
double width;
public void vol(){
    System.out.println(height*width*depth);
}


public static void main(String[] args) {
    box s1 = new box();
    s1.height = 11;
    s1.depth = 11;
    s1.width = 11;
    s1.vol();
}
}
