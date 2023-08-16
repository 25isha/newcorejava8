package thread;
class Test1 
{ 
  synchronized public void countIncrement() 
    { 
        System.out.println("Increment values");
        for (int i = 0; i < 3; i++) 
        { 
            System.out.println(i); 
            try 
            { 
                Thread.sleep(400); 
            } 
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
     synchronized public void countDecrement() 
    { 
        System.out.println("Decrement values");
        for (int i = 3; i > 0; i--) 
        { 
            System.out.println(i); 
            try 
            { 
                Thread.sleep(400); 
            } 
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
} 
  
class MyThread1 extends Thread { 
   
    Test1 test; 
  
    MyThread1 (Test1 test) { 
        this.test = test; 
    } 
  
    @Override
    public void run() { 
        test.countIncrement(); 
        test.countDecrement();
    } 
} 
  
public class IncrementandDecrementValue
{ 
    public static void main(String[] args) 
    { 
        Test1 obj = new Test1(); //Object of Apple class that is shared amoung threads
  
        MyThread1 thread1 = new MyThread1(obj); 
        MyThread1 thread2 = new MyThread1(obj); 
  
        thread1.start(); 
        thread2.start(); 
    } 
} 
