
## OOP (Object-oriented programming)

####Plan: 

LinkedList implementation

equals and == difference (String example) (reflexive: for any non-null reference value x, x.equals(x) should return true, symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true, transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true, consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified, For any non-null reference value x, x.equals(null) should return false.)

Wrapper classes

####Task:
1. Реализовать простой контейнер (MyCollection) для всего на базе связного списка
Односвязный (next) список:
    public int size();
    public boolean isEmpty();
    public boolean contains(Object o);
    public boolean add(Object o);
    public boolean remove(Object o);
    public boolean addAll(MyCollection c);
    public void clear();
    public boolean retainAll(MyCollection c);
    public boolean removeAll(MyCollection c);
    public boolean containsAll(MyCollection c);

2. Реализовать интерфейс Iterable для своих реализаций ArrayList и LinkedList
3. Добавить алгоритмы поиска в контейнеры

