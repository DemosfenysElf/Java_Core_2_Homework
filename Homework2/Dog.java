package Homework2;

public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return  "Mr." + name ;
    }
    public String getAge() {
        return age + " years" ;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
