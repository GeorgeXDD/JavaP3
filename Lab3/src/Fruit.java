import java.util.Enumeration;

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
            totalSugar = totalSugar + fruits[i].weight;
        }
        return totalSugar;
    }
}
