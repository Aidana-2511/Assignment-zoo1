public class Mammal extends Animal {
    private boolean isDomesticated;
    public Mammal(String name,String species,int age,boolean isDomesticated) {
        super(name,species,age);
        this.isDomesticated = isDomesticated;
    }
    public boolean isDomesticated() {
        return isDomesticated;
    }
    @Override
    public String toString() {
        return super.toString()+",domesticated:"+isDomesticated;
    }
}