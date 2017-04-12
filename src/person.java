/**
 * Created by user on 11.04.2017.
 */
public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person ()
         person1.setAge(56);

        System.out.println( person1.getAge());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
