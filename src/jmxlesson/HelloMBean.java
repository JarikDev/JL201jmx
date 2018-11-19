package jmxlesson;

public interface HelloMBean {
    void sayHello();
    int addIntegers(int i,int b);
    Person returnPerson();
    String getName();
    void setName(String name);
}
