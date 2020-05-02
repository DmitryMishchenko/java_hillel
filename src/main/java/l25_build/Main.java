package l25_build;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import l6.inheritance.Person;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person("Ivan", "Ivanov");
        ObjectMapper mapper = new ObjectMapper();
        String serialized = mapper.writeValueAsString(person);
        System.out.println(serialized);
    }
}
