package net.neochain.corejava.thread;


class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class EvenOdd {
    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();  // Starts even thread
        odd.start();   // Starts odd thread
    }
}
//⭐ Output (order can differ, because threads run parallel)
//Copy code
//
//Even: 0
//Odd: 1
//Even: 2
//Odd: 3
//Even: 4
//Odd: 5
//...
//✔ Why this is correct?
//Two separate threads
//Both run simultaneously
//Thread-1 prints even numbers
//Thread-2 prints odd numbers
//Uses start() for parallel execution
//If you want, I can also give: ✅ Same program using Runnable
//✅ Same program using sleep()
//Just tell me!