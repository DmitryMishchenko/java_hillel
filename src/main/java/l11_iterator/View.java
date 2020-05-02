package l11_iterator;

import java.util.Collection;

public class View {
    public void print(Collection group){
        Object[] objects = group.toArray();
        for (Object o : objects){
            System.out.println(o);
        }
    }
}
