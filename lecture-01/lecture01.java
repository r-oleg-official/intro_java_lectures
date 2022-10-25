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
        System.out.println();
        
        classesWrapper();
        System.out.println();
        
        operationsJava();
        System.out.println();

        toBitOperations();
    }
    
    public static void typeInt() {
        short age = 10;
        int salary = 123456;
        int i = 23_123_34;          //2312334
        System.out.println(age);    //10
        System.out.println(salary); //123456
        System.out.println(i);
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
        return o.getClass().getSimpleName(); //  метод получения тип данных
    }

    public static void classesWrapper() {
        // Классы-обертки
        int a = 123;
        System.out.println(Integer.MAX_VALUE);
        char b = '2';
        System.out.println(Character.isDigit(b)); // true
        String s = "qwer";
        System.out.println(s.length());     // 4
        System.out.println(s.charAt(1));    // w
    }

    public static void operationsJava() {
        int a = 123;
        a++;
        System.out.println(a);  // 124

        a = 123;
        System.out.println(a++);    // 123
        System.out.println(a);      // 124

        a = 125;
        System.out.println(++a);
        System.out.println(a);
        System.out.println();

        // недобросовестные интервьюеры спрашивают
        System.out.println("Недобросовестные интервьюеры");
        a = 123;
        a = a-- - --a;
        System.out.println(a); // 2
        a = --a - a--;
        System.out.println(a);  // 0
        a = --a-a--;
        System.out.println(a);  // 0
        System.out.println();
        
        System.out.println("Инкремент в цикле 'for'");
        for(int i = 0; i < 3; i++) {
            System.out.println(i);      // 0 1 2
        }
        System.out.println();

        for(int i = 0; i < 3; ++i) {
            System.out.println(i);      // 0 1 2
        }
        System.out.println();

        for(int i = 0; i < 3;) {
            System.out.println(i++);    // 0 1 2
        }
        System.out.println();

        // Операции сравнения
        System.out.println("Операции сравнения");
        boolean f = 123 > 234;
        System.out.println(f);  // false
        f = 123 <= 234;
        System.out.println(f);  // true
        f = 123 != 234;
        System.out.println(f);  // true
    }

    public static void toBitOperations() {
        // побитовые операции
        int a = 8;      // 1000 - в битах
        // a = a << 1;  // 10000
        // System.out.println(a);   // 16
        System.out.println(a << 1); // 16
        
        a = 18;      // 10010 - в битах
        // a = a >> 1;  // 1001
        // System.out.println(a);   // 9
        System.out.println(a >> 1); // 9
        
        int b = 5;
        int c = 2;
        System.out.println(b | c);  // 7
        // 101 - 5
        // 010 - 2
        // 111 - 7

        System.out.println(b & c);  // 0
        // 101 - 5
        // 010 - 2
        // 000 - 0
        
        System.out.println(b ^ c);  // 0
        // 101 - 5
        // 010 - 2
        // 111 - 7

        boolean d = true;
        boolean e = true;
        System.out.println(d & e);  // true
        System.out.println();

        String s = "qwer"; // длина 4, 0..3
        boolean i = s.length() >= 5 && s.charAt(4) == '1'; // false && false
        System.out.println(i); // false

        s = "qwwe1"; // длина 5, 0..4
        i = s.length() >= 5 && s.charAt(4) == '1'; // true && true
        System.out.println(i); // true
        i = s.length() >= 5 & s.charAt(4) == '1'; // true && true
        System.out.println(i); // true

        s = "qww1"; // длина 4, 0..3
        i = s.length() >= 5 & s.charAt(4) == '1'; // false && false
        System.out.println(i); // Exception
        

    }
}
