package JavaClass;
import Extends.Human;
import Extends.Administrator;
import Extends.Teacher;

public class ClassLesson {

    public static void main(String[] args) {

        Problem p = new Problem();
        System.out.println(p.name);
        p.sum(4, 6);

        Problem sg = new Problem();
        sg.setEngine(-8.8);
        System.out.println(sg.getEngine());

        String text = "Helloo";
        System.out.println(text.length());
        System.out.println(text.charAt(1));
        int countOfL = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'l')
                countOfL++;
        }
        System.out.println(countOfL);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());


        String s = "4.8";
        double z = Double.parseDouble(s);
        System.out.println(z + 1);


        byte x = 4;
        int a = 129;
        x = (byte) a;
        System.out.println(x);

        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);

        x += 5;
        System.out.println(x);

        x = 1;
        System.out.println(x + 5 + " Java");
        System.out.println("Barev " + x + 5 + " Java");
        System.out.println("Barev " + (x + 5) + " Java");

        String ss = "4.8";
        double zz = Double.parseDouble(ss);
        System.out.println(zz + 1);
        //-------------------------------------------------------

        Student s1 = new Student();
        s1.setAge(44);
        s1.setName("Alen");

        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s2.getName());
        System.out.println(s3.getName());


        Student s4 = new Student("Alen");
        System.out.println(s4.getName());
        Student s5 = new Student("Alen", 21);
        System.out.println(s5.getName() + " " + s5.getAge());

        Car c = new Car("44aa444");
        Car c2 = new Car();
        //---------------------------------------------------
        s1.sum(4, 5);
        s1.sum(7, 8, 6);
        s1.f();
        s1.f(4);
        s1.f(4, "a");


        //-------------------------------------------------------
        //Xndirner
        System.out.println("\n-----------------");
        Problem problem1 = new Problem();
        problem1.print7();
        System.out.println("\n-----------------");
        problem1.oddNumbers();
        System.out.println("\n-----------------");
        problem1.CommonElements();
        System.out.println("\n-----------------");
        problem1.MissingNumber();
        System.out.println("\n-----------------");
        problem1.MinNumber();
        System.out.println("\n-----------------");
        problem1.Palindrom();
        System.out.println("\n-----------------");
        problem1.InAscendingOrder();
        System.out.println("\n-----------------");
        problem1.Prime();
        System.out.println("\n------------------");
        problem1.Matrix();
        System.out.println("\n------------------");
        problem1.FirstRepeatingNumberIndex();
        System.out.println("\n------------------");
        problem1.Swap();
        System.out.println("\n------------------");
        //------------------------------------------------------------


        Teacher t1 = new Teacher();
        t1.setName("Alen");
        t1.setYear(2001);
        t1.setSalary(1000);
        t1.setPhone("56465132");
        t1.printInfo();

        System.out.println("--------------");


        Administrator a1 = new Administrator();
        a1.setName("Anna");
        a1.setDepartment("Music");
        a1.setYear(1999);
        a1.setPhone("17798465132");
        a1.printInfo();

    }
}
