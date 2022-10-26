import java.util.ArrayList;

public abstract class Fruit {
    Integer weight;
    Integer sugar;
    Integer water;
    Color color;
    public Fruit(Integer weight, Integer sugar, Integer water, Color color){
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }
    enum Color{
        Red,Blue,Yellow,Green;
    }

    static int computeWeight(Fruit[] fruits){
        int totalWeight = 0;
        for(int i=0;i<fruits.length;i++){
            totalWeight = totalWeight + fruits[i].weight;
        }
        return totalWeight;
    }
    static int computeSugarContent(Fruit[] fruits){
        int totalSugar = 0;
        for(int i=0;i<fruits.length;i++){
            totalSugar = totalSugar + fruits[i].sugar;
        }
        System.out.println(totalSugar);
        return totalSugar;
    }

    static void prepareFruit(Fruit[] fruits){
            for(int i=0;i<fruits.length;i++){
                if(fruits[i] instanceof Apple){
                    if(((Apple) fruits[i]).hasSeeds()) {
                        ((Apple) fruits[i]).removeSeeds();
                    }
                }
                if(fruits[i] instanceof Banana){
                    if(((Banana) fruits[i]).hasPeel()){
                        ((Banana) fruits[i]).peelOff();
                    }
                }
                if(fruits[i] instanceof Mango){
                    if(((Mango) fruits[i]).hasSeeds()){
                        ((Mango) fruits[i]).removeSeeds();
                    }
                    if(((Mango) fruits[i]).hasPeel()){
                        ((Mango) fruits[i]).peelOff();
                    }
                }
            }
    }
}
