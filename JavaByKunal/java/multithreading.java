// extend
// implement
// class thread1 extends Thread{
//     public void run(){
//     for(int i = 0; i<1000;i++){
//         System.out.print(" Hello ");
//         }
//     }
// }
// class thread2 extends Thread{
//     public void run(){
//     for(int i = 0; i<1000;i++){
//         System.out.print(" THANKS ");
//         }
//     }}
// public class multithreading{
//     public static void main(String[] args){
//     thread1 t1 = new thread1();
//     thread2 t2 = new thread2();
//     t1.start();
//     t2.start();
//     for(int i = 0; i<1000;i++){
//         System.out.print(" GLA ");
//         }
//     }
// }
// class runnable1 implements Runnable{
//     public void run(){
//     for(int i = 0; i<100;i++){
//         System.out.print(" Hello ");
//         }
//     }
// }
// class runnable2 implements Runnable{
//     public void run(){
//     for(int i = 0; i<100;i++){
//         System.out.print(" THANKS ");
//         }
//     }}
// public class multithreading{
//     public static void main(String[] args){
//     runnable1 r1 = new runnable1();
//     runnable2 r2 = new runnable2();
//     Thread t1 = new Thread(r1);
//     Thread t2 = new Thread(r2);
//     t1.start();
//     t2.start();
//     for(int i = 0; i<100;i++){
//         System.out.print(" GLA ");
//         }
//     }
// }



// Lifecycle of a thread::

// new ==>runnablle

// write get priority and set priority method in java thread?
public class MyThread extends Thread {  
    public void run() {  
        System.out.println("Thread running with priority: " + getPriority());  
    }  

    public static void main(String[] args) {  
        MyThread thread = new MyThread();  
        
        // Set the thread priority to MAX_PRIORITY  
        thread.setPriority(Thread.MAX_PRIORITY);  
        
        // Start the thread  
        thread.start();  
        
        // Get the current priority of the thread  
        System.out.println("Current thread priority: " + thread.getPriority());  
    }  
}
