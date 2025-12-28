import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private String name;
    private String location;
    private List<Animal> animals;
    public Zoo(String name, String location) {
        this.name = name;
        this.location = location;
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal a) {
        animals.add(a);
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public List<Animal> getAnimalsBySpecies(String species) {
        return animals.stream()
                .filter(a -> a.getSpecies().equalsIgnoreCase(species))
                .collect(Collectors.toList());
    }
    public List<Animal> getAnimalsSortedByAge() {
        return animals.stream()
                .sorted((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()))
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return "Zoo:"+name+",location:"+location+",total animals:"+animals.size();
    }
}