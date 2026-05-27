package fundamental;

public class usingrunnableinterface {
    public static void main(String[] args) {
        mytask task = new mytask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}

class mytask implements Runnable {
    static int count = 0;

    @Override
    public void run() {
        for(int i=1;i<=200000;i++){
            count++;
        }
        System.out.println(count);
    }
        
}
