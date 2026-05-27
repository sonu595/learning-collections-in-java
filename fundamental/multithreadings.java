package fundamental;

public class multithreadings {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        t1.start();
        t2.start();
    }
}

class mythread extends Thread {
    static int count = 0;

    @Override
    public void run() {
        for(int i=1;i<=200;i++){
            count++;
        }
        System.out.println(count);
    }
    
}
