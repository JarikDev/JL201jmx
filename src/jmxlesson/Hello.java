package jmxlesson;

public class Hello implements HelloMBean {
    private String name;



    public void sayHello() {
        System.out.println("Hello from JNX");
    }

    @Override
    public int addIntegers(int a, int b) { return a+b;}

    @Override
    public Person returnPerson() { return new Person();}

    @Override
    public String getName() {return name; }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
