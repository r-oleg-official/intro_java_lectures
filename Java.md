## String.

String - ссылочный тип.

Удаление пробелов в начале и в конце строки:

    s.trim()

Удаление пробелов, табуляции и прочего [см](https://russianblogs.com/article/2710607378/):

    public class StringUtils {
 
	public static String replaceBlank(String str) {
		String dest = "";
		if (str!=null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
	public static void main(String[] args) {
		System.out.println(StringUtils.replaceBlank("just do it!"));

## Arrays.
### Одномерные массивы.
#### Объявление массива.

    int[] arr = new int[arr.length];
    int[] arr = new int[3]{1, 2, 3}; // new int[] - так не обязательно
    int[] arr = {1, 2, 3};
    
    
> Означает отсутствие элемента. У массива есть вместимость (capcity) и фактическое кол-во элементов, 
> вы возвращаете второй. Все, что после того, что вы вернули считается мусором.
    
Если нужен символ то к нему обращаются:
    
    s.charAt(2)


### Двумерные массивы.
#### Объявление массива.
    
    int[][] arr = new int[3][5];

## Списки. ArrayList.
* [Класс ArrayList](https://javarush.ru/groups/posts/klass-arraylist)
* [Удаление элемента из списка ArrayList](https://javarush.ru/groups/posts/1935-udalenie-ehlementa-iz-spiska-arraylist)


## Преобразования.
### Метод valueOf() [см](https://proglang.su/java/numbers-valueof)
    
    Integer x = Integer.valueOf(9);
    Double c = Double.valueOf(5);
    Float a = Float.valueOf("80");               
    Integer b = Integer.valueOf("444",16);

    System.out.println(x); 
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);

### Возвращаемое значение
* valueOf(int i): возвращает целочисленный объект, содержащий значение указанного типа.
* valueOf(String s): возвращает объект Integer, содержащий значение указанного строкового представления.
* valueOf(String s, int radix): возвращает целочисленный объект, содержащий целое значение указанного строкового представления, разобранного со значением системы счисления.


## Files.

Вывод в файл: 

    FileWriter writer = new FileWriter("file.txt", false))
    {
            writer.write("hello");
            writer.flush();
    }



## Материалы.
#### LetCode.
1. [LeetCode(1-50). Answers.](https://russianblogs.com/article/6338350464/)
2. [LeetCode #27 - Remove Element](https://redquark.org/leetcode/0027-remove-element/)
   
### String.
1. [Удаление пробелов из строк в Java](https://overcoder.net/q/1962/%D1%83%D0%B4%D0%B0%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%BF%D1%80%D0%BE%D0%B1%D0%B5%D0%BB%D0%BE%D0%B2-%D0%B8%D0%B7-%D1%81%D1%82%D1%80%D0%BE%D0%BA-%D0%B2-java)
2. [Удалить все пробелы в строке в Java](https://russianblogs.com/article/2710607378/)
3. [Поиск, получение, удаление подстроки в String](https://javarush.ru/quests/lectures/questmultithreading.level02.lecture04)
4. 

### Regexet
1. [Регулярные выражения в Java](https://javarush.ru/groups/posts/regulyarnye-vyrazheniya-v-java)


1. [IntelliJ IDEA: стиль и форматирование кода](https://javarush.ru/groups/posts/2009-intellij-idea-stiljh-i-formatirovanie-koda)



[Работа со строками](https://metanit.com/java/tutorial/7.1.php)

[Java: как проверить, содержит ли строка подстроку](https://dev-gang.ru/article/java-kak-proverit-soderzhit-li-stroka-podstroku-0c4hoa1j3h/)

[Пишем поиск подстроки лучше, чем в учебниках](https://habr.com/ru/company/jugru/blog/491750/)

[Найти вхождения подстроки в строку в Java](https://www.techiedelight.com/ru/find-occurrences-of-substring-string-java/)
[Найти последнее вхождение подстроки в строке](https://proglang.su/java-examples/strings-last-occurance)
