package l13_enum.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Provider provider = new Provider();
        Integer ext = 100;
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Stream<String> stringStream = integers.stream().map((x) -> x + provider.get(ext));
        long count = stringStream.count();
    }
}
