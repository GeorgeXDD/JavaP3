import java.util.*;
import java.util.List;

public abstract class Fruit implements Comparable {
    Integer weight;
    Integer sugar;
    Integer water;
    Color color;


    static void CompareBySugar(ArrayList<Fruit> fruits)
    {
        for (int i = 0 ; i< fruits.size()-1 ; i++)
        {
            for(int j = 0 ;j< fruits.size() ; j++)
            {
                if(fruits.get(i).sugar.equals(fruits.get(j).sugar))
                {
                    System.out.println("Same shit");
                }
                if(fruits.get(i).sugar>fruits.get(j).sugar)
                {
                    System.out.println("Fructu i ii mai dulce decat fructu j");
                }
                else
                {
                    System.out.println("Ghici ce, frcutu j ii mai dulce decat fructu i");
                }
            }
        }
    }


    @Override
    public void compare(ArrayList<Fruit> fruits)
    {
        for(int i = 0; i<fruits.size()-1;i++)
        {
            for (int j = 1 ; j< fruits.size();j++)
            {
                if(fruits.get(i).weight > fruits.get(j).weight)
                {
                    ///Fucking do something, idk it wasn't specified
                }
                if(fruits.get(i).weight.equals(fruits.get(j).weight))
                {
                    CompareBySugar(fruits);
                }
            }
        }
    }


    public Fruit(Integer weight, Integer sugar, Integer water, Color color)
    {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }

    enum Color
    {
        Red,Blue,Yellow,Green
    }


    static int computeWeight(Fruit[] fruits)
    {
        int TotalWeight = 0;
        for(int i =0 ;i< fruits.length;i++)
        {
            TotalWeight += fruits[i].weight;
        }
        return TotalWeight;
    }

    static int computeWeight(ArrayList<Fruit> fruits)
    {
        int TotalWeight = 0;
        for(int i = 0 ; i < fruits.size();i++)
        {
            TotalWeight += fruits.get(i).weight;
        }
        return TotalWeight;
    }




    static int computeSugarContent(Fruit[] fruits)
    {
        int TotalSugar = 0;
        for(int i =0 ;i< fruits.length;i++)
        {
            TotalSugar += fruits[i].sugar;
        }
        return TotalSugar;
    }

    static int computeSugarContent(ArrayList<Fruit> fruits)
    {
        int TotalSugar = 0;
        for(int i =0 ;i< fruits.size();i++)
        {
            TotalSugar += fruits.get(i).sugar;
        }
        return TotalSugar;
    }


    static void prepareFruit(Fruit[] fruits)
    {
        for(int i =0 ;i<fruits.length;i++)
        {
            if(fruits[i] instanceof Banana)
            {
                if(((Banana) fruits[i]).hasPeel())
                    ((Banana) fruits[i]).PeelOff();
                    ///System.out.println(((Banana) fruits[i]).Peel);
            }

            if(fruits[i] instanceof Apple)
            {
                if(((Apple) fruits[i]).hasSeeds())
                    ((Apple) fruits[i]).removeSeeds();
                         ///System.out.println(((Apple) fruits[i]).Seed);
            }

            if(fruits[i] instanceof Mango)
            {
                if (((Mango) fruits[i]).hasSeeds())
                    ((Mango) fruits[i]).removeSeeds();
                ///System.out.println(((Mango) fruits[i]).Seed);
                if(((Mango) fruits[i]).hasPeel())
                    ((Mango) fruits[i]).PeelOff();
                ///System.out.println(((Mango) fruits[i]).Peel);
            }
        }
    }

    static void prepareFruit(ArrayList<Fruit> fruits)
    {
        for(int i = 0 ; i< fruits.size() ; i++)
        {
            if(fruits.get(i) instanceof Banana)
            {
                if(((Banana) fruits.get(i)).hasPeel())
                {
                    ((Banana) fruits.get(i)).PeelOff();
                }
            }
            if(fruits.get(i) instanceof Apple)
            {
                if(((Apple) fruits.get(i)).hasSeeds())
                {
                    ((Apple) fruits.get(i)).removeSeeds();
                }
            }
            if(fruits.get(i) instanceof Mango)
            {
                if(((Mango) fruits.get(i)).hasPeel())
                {
                    ((Mango) fruits.get(i)).PeelOff();
                }
                if (((Mango) fruits.get(i)).hasSeeds())
                {
                    ((Mango) fruits.get(i)).removeSeeds();
                }
            }
        }
    }

    static Map<String,Integer> countFruit(List<Fruit> fruits)
    {
        int nrApple = 0;
        int nrMango = 0;
        int nrBanana = 0;
        Map<String,Integer> FM= new HashMap<>();

        for(int i = 0 ;i< fruits.size();i++)
        {
            if(fruits.get(i) instanceof Apple)
            {
                FM.put("Apple", nrApple+=1);
            }
            if(fruits.get(i) instanceof Mango)
            {
                FM.put("Mango", nrMango+=1);
            }
            if(fruits.get(i) instanceof Banana)
            {
                FM.put("Banana", nrBanana+=1);
            }
        }
        return FM;
    }



    static void testFruitComparison(ArrayList<Fruit> fruits)
    {

        Comparator<Fruit> CompareBySugar =(Fruit f1, Fruit f2) -> f1.sugar.compareTo(f2.sugar) ;
        Comparator<Fruit> CompareByWeight = (Fruit f1, Fruit f2) -> f1.weight.compareTo(f2.weight);
        Comparator<Fruit> CompareByWater = (Fruit f1, Fruit f2) ->f1.water.compareTo(f2.water);

        Collections.sort(fruits, CompareByWater);

        Collections.sort(fruits, CompareBySugar);

        Collections.sort(fruits,CompareBySugar);


        System.out.println(Collections.min(fruits,CompareBySugar));
        System.out.println(Collections.max(fruits,CompareByWeight));
    }

    public static <T extends Fruit> int Popular(ArrayList<Fruit> fructe)
    {
        int NrTimes = Collections.max(countFruit(fructe).values());
        return NrTimes;
    }
}
