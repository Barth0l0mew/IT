package OOP.StreamAPI.ControlTest;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.text.Document;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ControlTest {

    @Test
    public void test1a() throws IOException {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1", "b1");
        // Проверить первый элемент коллекции,
        String first = collection.stream().findFirst().orElse(null);
        //Assertions.assertEquals(first,(String) collection.toArray()[0]);

        // последний элемент коллекции,
        //String last = collection.stream().collect(Collectors.toList()).get(collection.size()-1);
        String last = collection.stream().skip(collection.size()-1).findAny().orElse(null);
        //Assertions.assertEquals(last,(String) collection.toArray()[collection.size()-1]);
        // число элементов,
        long count = collection.stream().count();
        // проверить, существует ли элемент

        String find = collection.stream().filter("a3"::equals).findFirst().get();
        //Выбрать элемент по шаблону regex, чтобы строка начиналась на 'b'
        List<String> selected= collection.stream().filter(s-> Pattern.compile("[b].*").matcher(s).matches()).collect(Collectors.toList());
        System.out.println(selected);
        Assertions.assertAll("instanve check 1",
            ()-> Assertions.assertEquals(first,(String) collection.toArray()[0]),
            ()->Assertions.assertEquals(last,"b1"),
            ()->Assertions.assertEquals(count,collection.toArray().length),
            ()->Assertions.assertEquals(find,"a3"),
                ()->Assertions.assertEquals("b1",selected.get(0))
                );

    }

    @Test
    public void test1() throws IOException {
        //Используя stream, записать в файл последовательность строк "a1,b2,c3,d4...z26"
        File file = new File("src/tests/data.txt");
        PrintWriter out = new PrintWriter(file);
        IntStream.rangeClosed(1,26)
                .mapToObj(i->new StringBuilder().append(Character.toString(i+'a'-1))
                        .append(Integer.toString(i)).toString())
                .forEach(out::println);
        out.close();
        FileReader in = new FileReader(file);

        //Прочитать данные из файла. Проверить первую и последнюю записанные строки
        List<String> strings = Files.lines(Paths.get("src/tests/data.txt"))
                .collect(Collectors.toList());
        System.out.println(strings);
        Assertions.assertAll("executable instance check 2 ",
                () -> Assertions.assertEquals(strings.get(0), "a1"),
                () -> Assertions.assertEquals(strings.get(strings.size() - 1), "z26")
        );
    }

    @Test
    public void test1b() throws IOException {
        // Выбрать мужчин от 20 до 30 лет
        List<Person> mans = Person.persons.stream().filter(p->p.getAge()>=20&&p.getAge()<=30&&p.getSex()==Person.Sex.MAN).collect(Collectors.toList());
        System.out.println("Exercise 1\n"+mans);
        // Найти средний возраст среди мужчин
        Double meanAge = Person.persons.stream()
                .filter(p->p.getSex()==Person.Sex.MAN)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println("Exercise 2\n"+meanAge);
        // Найти количество трудоспособных (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        Long count =Person.persons.stream()
                .filter(p->p.getAge()>=18)
                .filter(p->(p.getSex()==Person.Sex.MAN&&p.getAge()<=60)||(p.getSex()==Person.Sex.WOMAN&&p.getAge()<=55))
                .count();
        System.out.println("Exercise 3 \n"+count);
        // Найти человека с максимальным возрастом
        Person older = Person.persons.stream()
                .max((p1,p2)->p1.getAge().compareTo(p2.getAge()))
                .get();
        System.out.println("Exercise 4 \n"+older.toString());

        // Отсортировать по имени в обратном алфавитном порядке
        List<Person> byName = Person.persons.stream()
                .sorted((p1,p2)->-p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());
        System.out.println("Exercise 5 \n"+byName);
        // Отсортировать сначала по полу, а потом по возрасту
        List<Person> sorted2 = Person.persons.stream()
                .sorted((p1,p2)->p1.getSex()!=p2.getSex()?p1.getSex().compareTo(p2.getSex()): p1.getAge().compareTo(p2.getAge()))
                        .collect(Collectors.toList());
        System.out.println("Exercise 6 \n"+Arrays.toString(sorted2.toArray()));

        //Группировка по полу
        Map<Person.Sex, List<Person>>  group = Person.persons.stream()
                        .collect(Collectors.groupingBy(Person::getSex));
        System.out.println("Exercise 7 \n"+group.toString());

        Assertions.assertAll("Exercise 3",
                ()->Assertions.assertEquals(mans.size(),2),
                ()->Assertions.assertEquals(meanAge,34.6),
                ()->Assertions.assertEquals(count,5),
                ()->Assertions.assertEquals(older.getName(),"John")

               );

    }
    @Test
    public void test1c() throws IOException {
        // Выбрать мужчин от 20 до 30 лет
        List<Person> mans = Person.persons.stream()
                .filter(p->p.getAge()>=20&&p.getAge()<=30&&p.getSex()== Person.Sex.MAN).collect(Collectors.toList());
        // Найти средний возраст среди мужчин
        //  Double meanAge =
        Person.persons.stream ().filter(i->i.getSex()==Person.Sex.MAN).mapToInt(i->i.getAge()).average().getAsDouble();
        // Найти количество трудоспособных (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        long count = Person.persons.stream()
            .filter(i->i.getAge()>=18)
            .filter(p->(p.getSex()==p.getSex().WOMAN&&p.getAge()<55)||p.getSex()==p.getSex().MAN && p.getAge()<60).count();
        // Найти человека с максимальным возрастом
        Person Older = Person.persons.stream()
            .max((p1,p2)->p1.getAge().compareTo(p2.getAge())).get();
        // Отсортировать по имени в обратном алфавитном порядке
        List<Person>byName =Person.persons.stream().sorted((p1,p2)->-p1.getName().compareTo(p2.getName()))
            .collect(Collectors.toList());

    }

    @Test
    public void test2() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Получить все числа подряд, записать в массив целых чисел
        int[] numbers =collection.stream()
                .mapToInt(s->Integer.parseInt(s.substring(1)))
                .toArray();
        System.out.println("Exercise 1\n"+Arrays.toString(numbers));
        // Получить все числа подряд, записать в массив строк
        collection = Arrays.asList("1,2,0", "4,5");
        String[] strings = collection.stream()
                .flatMap(s->Arrays.asList(s.split(",")).stream())
                .toArray(String[]::new);
        System.out.println("Exercise 2\n"+Arrays.toString(strings));

        //Найти сумму всех чисел, которые хранятся через запятую в collection
        collection = Arrays.asList("1,2,0", "4,5", "1,2");
        int sum =
                collection.stream()
                        .flatMapToInt(s->Arrays.asList(s.split(",")).stream()
                                .mapToInt(Integer::parseInt))
                .sum();
//                      .flatMapToInt(s->Arrays.asList(s.split(",")).stream()
//                                .mapToInt(Integer::parseInt)
//                                .sum();
        System.out.println("Exercise 3\n"+sum);

        Assertions.assertAll("Exercise 4",
                ()->Assertions.assertArrayEquals(numbers,new int[]{1,2,3,1}),
                ()->Assertions.assertArrayEquals(strings,new String[]{"1","2","0","4","5"}),
                ()->Assertions.assertEquals(sum,15)
        );
    }
}
