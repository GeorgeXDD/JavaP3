public class Apple extends Fruit implements SeedRemovable{
    public Apple(Integer weight, Integer sugar, Integer water,Color color)
    {
        super(weight,sugar,water,color);
    }

    boolean Seed = true;


    @Override
    public boolean hasSeeds()
    {
        if(Seed)
            return true;
        return false;
    }

    @Override
    public void removeSeeds()
    {
        Seed = false;
    }
}
