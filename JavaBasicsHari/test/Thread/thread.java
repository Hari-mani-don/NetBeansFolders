package Thread;
public class thread extends Thread {
    public static void main(String[] args) {
        thread thread = new thread();
        thread.start();
        thread.interrupt();
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
           
            try {
               
                Thread.sleep(2000);   
                 if(Thread.interrupted())
                System.out.println("hari");
            else System.out.println("fail");
          
                
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }

    }
}
