import javax.lang.model.element.PackageElement;

public class Mango extends Fruit implements Peelable,SeedRemovable {

    public Mango(Integer weight, Integer sugar, Integer water, Color color)
    {
        super(weight, sugar, water, color);
    }

    boolean Peel = true ;
    boolean Seed = true ;


    @Override
    public boolean hasPeel()
    {
        if(Peel)
            return true;
        return false;
    }

    @Override
    public void PeelOff()
    {
        Peel = false;
    }


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
