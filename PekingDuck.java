public class PekingDuck extends Duck{
    PekingDuck(String name)
    {
        super(name);
    }
    public void beCrispy()
    {
        System.out.println("Grob Grob! (sound effect) ");
    }
    public void clean(Animal animal)
    {
        System.out.println("I cannot clean , i died already");
    }
}
