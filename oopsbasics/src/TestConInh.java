public class TestConInh {
    public static void main(String[] args) {
//        employee e1 = new employee("priya", 32);
//        System.out.println(e1.name + " " + e1.age);
        devep d = new devep("shruti", 23);
        d.skip();
    }
}
class devep extends employee {
    public devep(String name, int age) {


        super(name, age);
    }
}
class employee {
    String name;
    int age;
    //constructor
    public employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void skip() {
        System.out.println(name + " is skipping");
    }
}
