package net.neochain.corejava.thread;

class Example2 extends Thread {

    public void run() {
        System.out.println("Example Using Extending Thread");
    }

    class Example3 implements Runnable {
        @Override
        public void run() {
            System.out.println("Example by implements Runnable");
        }
    }

    public static void main(String[] args) {

        Example2 example2 = new Example2();
        example2.start();

        // Create outer class object
        Example2 outer = new Example2();

        // Create inner class object (Example3)
        Example3 example3 = outer.new Example3();

        Thread t1 = new Thread(example3);
        t1.start();
    }
}