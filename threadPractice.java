class threadPractice{

    // extends Thread
    // static class A extends Thread{
    //     public void run(){
    //         for(int i = 0; i < 100; i++){
    //             System.out.println("Hii");
    //                 try {
    //                     Thread.sleep(10);
    //                 } catch (InterruptedException e) {
    //                     e.printStackTrace();
    //                 }
                
    //         }
    //     }
    // }

    // static class B extends Thread{
    //     public void run(){
    //         for(int i = 0; i < 100; i++){
    //             System.out.println("Hello");
    //             try {
    //                     Thread.sleep(10);
    //                 } catch (InterruptedException e) {
    //                     e.printStackTrace();
    //                 }
    //         }
    //     }
    // }

    // implements Runnable
    static class A implements Runnable{
        public void run(){
            for(int i = 0; i < 5; i++)
                System.out.println("Hi");
        }
    }
    static class B implements Runnable{
        public void run(){
            for(int i = 0; i < 5; i++)
                System.out.println("Hello");
        }
    }

    public static void main(String[] Args){
        // A obj1 = new A();
        // B obj2 = new B();
        

        
        // Sequential execution
        // obj1.run();
        // obj2.run();

        // Priority
        // System.out.println(obj1.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.MIN_PRIORITY);

        // Thread execution
        // obj1.start();
        // obj2.start();

        // Object of runnable interface
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        // Creating anonymous inner classes of functional interface runnable with lambda expressions
        Runnable obj1 = () -> {
                for(int i = 0; i < 5; i++){
                    System.out.println("Hii");
                    try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };

        Runnable obj2 = () -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}