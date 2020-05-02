package l11_iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        //backend
        Collection ar = new ArrayList();
        ar.add(1);
        ar.add(2);

        Iterable iterable = ar;




        for (Object o : iterable){
            System.out.println(o);
        }
        //        view
//        View view = new View();
//        view.print(group);







    }
}
