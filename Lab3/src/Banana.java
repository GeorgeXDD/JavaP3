public class Banana extends Fruit implements Peelable{
    public Banana(Integer weight, Integer sugar, Integer water)
    {
        super(weight,sugar,water,Color.Yellow);
    }

    boolean Peel = true;


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
}
