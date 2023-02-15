
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<gender> genders = List.of(gender.남, gender.여, gender.남, gender.남, gender.남, gender.여);

        Stream<String> ss = names.stream();
        ss.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        ss.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        System.out.println(ss.findFirst());
        ss = names.stream();
        System.out.println(ss.findFirst().get());
        ss = names.stream();
        System.out.println(ss.count());
        System.out.println();

        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce(0, (a, b) -> a + b));
        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());
    }
}

enum Gender {
    남, 여
}

class Member {
    String name;
    gender gender;
    int age;

    public Member(String name, gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
