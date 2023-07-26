import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.itemGenerator;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;

public class App {
    public static void main(String[] args) throws Exception {
        itemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        itemGenerator fab2 = new GemFabric();
        fab2.openReward();
        //System.out.println("Hello, World!");
        Random rnd = ThreadLocalRandom.current();
        List<itemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);

        for(int i=0; i<20;i++)
        {
            int index = Math.abs(rnd.nextInt()%2==0?0:1);
            fabricList.get(index).openReward();
        }
    }
}
