public class Zookeeper {
    private String name;
    private int age;
    private String shift;

    public Zookeeper(String name, int age, String shift) {
        this.name = name;
        this.age = age;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getShift() {
        return shift;
    }

    public String toString() {
        return "Zookeeper: " + name + ", age: " + age + ", shift: " + shift;
    }
}