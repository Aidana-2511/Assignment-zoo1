public class Main {
    public static void main(String[] args) {
        Animal x = new Animal("Lion", "Big Cat", 1);
        Animal y= new Animal("Tiger", "Big Cat", 2);
        Animal z = new Animal("Wolf", "Canine", 3);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Zoo x1 = new Zoo("Lion", "Zoo", 100);
        Zoo y2= new Zoo("Tiger", "Zoo", 200);
        Zoo z3= new Zoo("Wolf", "Zoo", 90);

        System.out.println(x1);
        System.out.println(y2);
        System.out.println(z3);

        Zookeeper v1 = new Zookeeper("Ali", 30, "Morning");
        Zookeeper v2 = new Zookeeper("Aisha", 25, "Evening");

        System.out.println(v1);
        System.out.println(v2);


    }
}