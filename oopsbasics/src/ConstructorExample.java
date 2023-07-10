public class ConstructorExample {
    public static void main(String[] args) {
        constructor c1 = new constructor();
        System.out.println(c1.name);
        System.out.println(c1.age);

        constructor c2 = new constructor(12, "swara");
        System.out.println(c2.name);
        System.out.println(c2.age);

        System.out.println(constructor.count);
    }
}
class constructor{
    String name;
    int age;


    static int count;

    constructor(){
        count++;
//        System.out.println("default constructor");
    }
    constructor(int age, String name){
        this.name= name;
        this.age = age;
//        System.out.println("parametrized");


    }

}

