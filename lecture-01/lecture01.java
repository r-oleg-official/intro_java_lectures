public class lecture01 {
    /*
    * comment
    */

    // - Простой комментарий

    // Структура простой программы
    /**
    * Program
    */
    // public class Program {
    //     public static void main(String[] args) {
    //         System.out.println("Goodbye, World");
    //     }
    // }
        
    public static void main(String[] args) {
        typeInt();
        System.out.println();
        typeDouble();
        System.out.println();
        typeChar();
        System.out.println();
        convIntDouble();
        typeBoolean();
        System.out.println();
        typeString();
        System.out.println();
        typeImplicit();
    }
    
    public static void typeInt() {
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456
    }
    
    public static void typeDouble() {
        float e = 2.7f;
        double pi = 3.1415;
        //double pi = 3.1415D;        // - необязательно так
        System.out.println(e);      //2.7
        System.out.println(pi);     //3.1415
    }

    public static void typeChar() {
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        ch = '{';
        System.out.println(ch); // {
        ch = 123;
        System.out.println(ch); // {
    }

    public static void convIntDouble() {
        int a = 15;
        double d = a;
        //a = d; // - так просто невозможно
    }

    public static void typeBoolean() {
        boolean falg1 = 123 <= 234;
        System.out.println(falg1); // true
        boolean falg2 = 123 >= 234;
        System.out.println(falg2); // false
        boolean falg3 = falg1 ^ falg2;
        System.out.println(falg3); // true
    }
    
    public static void typeString() {
        String s = null; // - так можно, это пустая ссылка
        String msg = "Hello, World!";
        System.out.println(msg);

    }

    public static void typeImplicit() {
        // Неявная типизация
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double

        d = 1022;
        System.out.println(d); // 1022
        // d = "mistake";
        // Type mismatch: cannot convert from String to double
        
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
