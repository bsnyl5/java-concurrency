/*
 * ThreadDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang

 */
package basic;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ThreadDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new MyRunnable1());
        thread1.start();
        
        thread1.join();
        
        System.out.println("ABC");
        //Thread.yield();
    }
}

class MyRunnable1 implements Runnable
{

    /**
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run()
    {
       System.out.println("Thread from Java SE 7");
    }
    
}



/*
 * Changes:
 * $Log: $
 */