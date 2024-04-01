//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       Runnable run = ()-> {
//               for(int i=0; i < 100 ; i++){
//                   System.out.println(i+" Human Cloud");
//               }
//               };
//
//       Thread thread = new Thread(run);
//       thread.start();
//
//       Thread thread1 = new Thread(run);
//       thread1.start();

        A a = () -> {
            System.out.println("Hello From Lambdas");
        };

        a.sayHello();

    }
}

@FunctionalInterface
interface A{

    public void sayHello();
}

// Multithreading is a feature in java where two or more pieces of code
// can be run concurrently

// there are two ways to implement mulithreading in java
// 1. to extend the thread class
// 2. to implement the runnable interface
// 3. Optional (We can also implement multithreading using lambdas)


//class B implements Runnable{
//
//    public void run(){
//        for(int i=0; i < 100 ; i++){
//            System.out.println(i+" Human Cloud");
//        }
//    }
//}

//class A extends Thread{
//
//    @Override
//    public void run(){
//        for(int i=0; i < 100 ; i++){
//            System.out.println(i+" Human Cloud ");
//        }
//    }
//}