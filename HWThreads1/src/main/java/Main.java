public class Main {
    public static void main(String[] args) throws Exception {
        MyThread MyThread = new MyThread();
        ThreadGroup mainGroup = new ThreadGroup("Основная группа потоков");
        Thread thread1 = new Thread(mainGroup, MyThread);
        Thread thread2 = new Thread(mainGroup, MyThread);
        Thread thread3 = new Thread(mainGroup, MyThread);
        Thread thread4 = new Thread(mainGroup, MyThread);
        thread1.setName("поток 1");
        thread2.setName("поток 2");
        thread3.setName("поток 3");
        thread4.setName("поток 4");
        thread1.start();
        Thread.sleep(600);
        thread2.start();
        Thread.sleep(300);
        thread3.start();
        Thread.sleep(300);
        thread4.start();
        Thread.sleep(15000);
        System.out.println("\nЗавершаю все потоки\n");
        mainGroup.interrupt();

    }
}
