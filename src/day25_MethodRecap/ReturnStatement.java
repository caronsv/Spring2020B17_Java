package day25_MethodRecap;

public class ReturnStatement {
    public static void main(String[] args) {
//        if (10>9){
//            return;  // ex
//        }
//        System.out.println("Hello");
        method1();
        System.out.println("Hello");
        method2();
        System.out.println("Sveta");
    }

    public static void method1(){
        if (10>9){
            return;}

    }
    public static void method2(){
        if (10>9){
            System.exit(0);
        }
        System.out.println("Hello Cybertek");
    }
}
