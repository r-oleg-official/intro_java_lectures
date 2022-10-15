 
1. Создать файл `program.java`. Создасться класс `public class program`:

    public class program {
        } 

 Это минимальная ед-ца в контексте ЯП Джава.

Нужно определить место, с которого буде стартовать программа - это наз точка входа. Она определяется функцией/методом `main()`:

    static public void main(String[] args) {       
    }

`String[] args` - обязятельная часть.

Это минимальная программа джава:

    public class program {
        static public void main(String[] args) {
        
        }
    }

Сниппеты. Начинаешь писать `class`, а VSC подскажет выбор, выбрать 2-й. Далее на 2-й строке написать `main`, выбрать 1-й пункт и сформируется метод `main(String[] args)` самостоятельно.

    System.out.println("bye world"); - простой код вывода в терминал

Через сниппет. Начать писать `sysout` в VSC и получится сразу `System.out.println();`.

