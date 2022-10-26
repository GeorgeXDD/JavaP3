public class Apple extends Fruit implements SeedRemovable{
    public Apple(Integer weight, Integer sugar, Integer water,Color color){
        super(weight,sugar,water,color);
    }

    boolean Seeds = true;
    @Override
    public boolean hasSeeds() {
        if(Seeds = true){
            return true;
        }
        return false;
    }

    @Override
    public void removeSeeds() {
        Seeds =  false;
    }
}