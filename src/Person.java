public class Person {

    public String name;
    public int age;
    public boolean gender;

    public String getName(){
        if (gender) {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
}
