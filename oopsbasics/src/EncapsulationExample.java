class Person {
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge(int i) { return age; }

    public void setAge(int age) { this.age = age; }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("swara");
        p.getAge(23);
        System.out.println("name:" + p.getName());
        System.out.println("age:"+ p.getName());

    }
}