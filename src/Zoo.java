public class Zoo {
    private String name;
    private String location;
    private int animalCount;
    public Zoo(String name,String location,int animalCount){
        this.name=name;
        this.location=location;
        this.animalCount=animalCount;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public int getAnimalCount(){
        return animalCount;
    }
    public String toString(){
        return "Animal: " + name + ",location : " + location+ ", animalCount: " + animalCount;
    }
}