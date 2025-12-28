import java.util.List;
public class Main{
    public static void main(String[] args) {

        Animal lion = new Mammal("Lion", "Big Cat", 5, false);
        Animal tiger = new Mammal("Tiger", "Big Cat", 3, false);
        Animal wolf = new Mammal("Wolf", "Canine", 4, false);

        Zoo myZoo = new Zoo("Central Zoo", "City Park");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(wolf);


        System.out.println(myZoo);

        List<Animal> bigCats = myZoo.getAnimalsBySpecies("Big Cat");
        System.out.println("Big Cats in the Zoo:" + bigCats);

        List<Animal> sortedAnimals = myZoo.getAnimalsSortedByAge();
        System.out.println("Animals sorted by age:" + sortedAnimals);


        Zookeeper z1 = new Zookeeper("Ali", 30, "Morning");
        Zookeeper z2 = new Zookeeper("Aisha", 25, "Evening");

        System.out.println(z1);
        System.out.println(z2);
    }
}