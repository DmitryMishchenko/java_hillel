package l20_21_io.serializationtest;

import java.io.Serializable;

public class HolderTwo implements Serializable {

    private transient Person person;

    public HolderTwo(Person person) {
        this.person = person;
    }
}
