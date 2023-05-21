import singleton.ThreadSafeSingleton;
import singletone.LazySingletone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LazySingletone inst1= LazySingletone.getInstance();
        LazySingletone inst2=LazySingletone.getInstance();
        System.out.println(inst1.hashCode());
        inst1.printData();
        System.out.println(inst2.hashCode());
        inst2.printData();

        new DataPrinter().start();
        new DataPrinter().start();
//
        }
    }
class DataPrinter extends Thread{
    public void run(){
        ThreadSafeSingleton.getInstance();
    }
}