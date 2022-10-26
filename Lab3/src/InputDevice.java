import java.util.ArrayList;

public class InputDevice {
    static Fruit[] readFruit(){
        Fruit[] list = new Fruit[3];
        Banana banana = new Banana(1,2,3);
        list[0] = banana;
        Apple apple = new Apple(1,3,1, Fruit.Color.Yellow);
        list[1] = apple;
        Mango mango = new Mango(3,10,2, Fruit.Color.Blue);
        list[2] = mango;
        Fruit.computeWeight(list);
        Fruit.computeSugarContent(list);
        return list;

    }

}
