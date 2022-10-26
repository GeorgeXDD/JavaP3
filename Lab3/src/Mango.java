public class Mango extends Fruit implements Peelable, SeedRemovable {
    public Mango(Integer weight, Integer sugar, Integer water, Color color) {
        super(weight, sugar, water, color);
    }

    boolean Seeds = true;
    boolean Peel = true;

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