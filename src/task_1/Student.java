package task_1;

public class Student {

    private String name;
    private int age;

    public Student() {
        name = "Diana";
        age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void Show() {
        System.out.println("Name and age: " + name + " " + age);

    }
}
