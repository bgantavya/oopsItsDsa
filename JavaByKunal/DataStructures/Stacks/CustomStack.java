public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Array is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop from empty stack");
            return -1;
        }
        return data[ptr--];
    }
    public int peek(){
        return data[ptr];
    }



    private boolean isFull(){
        return ptr == data.length -1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
    public static void main(String[] args) {
        CustomStack st = new CustomStack(4);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
