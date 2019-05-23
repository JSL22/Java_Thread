package process;

/**
 *
 */
public class Example {
    public static void main(String[] args) {
       //public static native Thread currentThread();
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName);
        NewPeople newpeople = new NewPeople("Java虚拟机启动时，会创建一个main线程\n");
//        Thread showNew = new Thread(newpeople);
//        showNew.start();
//        showNew.run();
        newpeople.run();
    }

            static class NewPeople implements Runnable {
                private  final String message;
                public NewPeople( String message) {
                   this.message= message;
                }
                private void doNew(String message) {
                    Thread currentThread = new Thread();
                    String currentThreadName = Thread.currentThread().getName();
                    System.out.println(currentThreadName);
                    System.out.println(message);

                }
                @Override
                public void run() {
                    doNew(message);
                }

            }

}
