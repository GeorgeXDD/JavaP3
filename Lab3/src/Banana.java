public class Banana extends Fruit implements Peelable{
    public Banana(Integer weight, Integer sugar, Integer water){
        super(weight,sugar,water,Color.Yellow);
    }

    boolean Peel = true;
    @Override
    public boolean hasPeel() {
        if(Peel=true){
            return true;
        }
        return false;
    }

    @Override
    public void peelOff() {
        Peel=false;
    }
}
