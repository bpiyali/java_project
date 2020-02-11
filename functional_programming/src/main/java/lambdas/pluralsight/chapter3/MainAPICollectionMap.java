package lambdas.pluralsight.chapter3;

import java.util.*;
import java.util.function.BinaryOperator;

public class MainAPICollectionMap {
    public static void main(String[] args) {
            Person p1 = new Person("Alice", 23);
            Person p2 = new Person("Brian", 56);
            Person p3 = new Person("Chelsea", 46);
            Person p4 = new Person("David", 28);
            Person p5 = new Person("Erica", 37);
            Person p6 = new Person("Francisco", 18);

            City newYork = new City("New York");
            City shanghai = new City("Shanghai");
            City paris = new City("Paris");

//        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
//        people.removeIf(person -> person.getAge()<30);
//        people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
//        people.sort(Comparator.comparing(Person::getAge).reversed());
//
//        people.forEach(System.out::println);

            Map<City, List<Person>> persons = new HashMap<>();
            persons.putIfAbsent(paris, new ArrayList<>());
            persons.get(paris).add(p1);

            persons.computeIfAbsent(newYork, city-> new ArrayList<>()).add(p2);
            persons.computeIfAbsent(newYork, city-> new ArrayList<>()).add(p3);

//        System.out.println("People from Paris: "+ persons.getOrDefault(paris, Collections.EMPTY_LIST));
//        System.out.println("People from New Yeork: "+ persons.getOrDefault(newYork, Collections.EMPTY_LIST));

            Map<City, List<Person>> map1 = new HashMap<>();
            map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
            map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
            map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);

            System.out.println("Map 1");
            map1.forEach((city, people) -> System.out.println(city + " : " + people));


            Map<City, List<Person>> map2 = new HashMap<>();
            map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
            map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
            map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);

            System.out.println("Map 2");
            map2.forEach((city, people) -> System.out.println(city + " : " + people));

            map2.forEach(
                    (city, people) -> {
                        map1.merge(city, people,
                                (peoplefromMap1, peoplefromMap2) ->{
                                    peoplefromMap1.addAll(peoplefromMap2);
                                    return peoplefromMap1;
                                });
                    }
            );
            System.out.println("Map 1 after merge");
            map1.forEach((city, people) -> System.out.println(city + " : " + people));

            BinaryOperator<Integer> op = Integer::sum;
            List<Integer> ints = new ArrayList<>(1);
            int sum =0;
            for(int i: ints){
                sum= op.apply(sum, i);
            }

        }
}
