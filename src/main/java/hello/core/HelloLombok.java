package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;
    private String sex;
    private int height;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("Lombok");
        helloLombok.setName("Real Lombok");
        helloLombok.setAge(10);
        helloLombok.setSex("Man");
        helloLombok.setHeight(180);

        String name = helloLombok.getName();
        System.out.println("name = " + name);

        int age = helloLombok.getAge();
        System.out.println("age = " + age);

    }
}
