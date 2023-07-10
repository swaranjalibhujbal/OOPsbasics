
//inheritance


import java.sql.SQLOutput;

public class Testinheritance {
  public static void main(String[] args)
    {
        developer d1= new developer();

        System.out.println(" manager salary "+" "+ d1.salary+ "\n" + "developer benefits " + d1.benefits);

        manager m1 = new manager();
        System.out.println(m1.salary);
     }
}

class manager{
    int salary = 50000;
}
class developer extends manager{
    int benefits = 30000;

}

