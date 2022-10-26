import java.util.ArrayList;

public class InputDevice {
    ArrayList<Fruit> readFruit(){
        ArrayList<Fruit> list = new ArrayList<>(10);
        Banana banana = new Banana(1,2,3);
        Apple apple = new Apple(1,3,1, Fruit.Color.Yellow);
        list.add(banana);
        list.add(apple);
        return list;
    }

}
