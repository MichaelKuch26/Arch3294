import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.itemGenerator;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.IronFabric;
import Classes.Rewards.OreFabric;
import Classes.Rewards.SilverFabric;
import Classes.Rewards.SulfurFabric;
import Classes.Rewards.TreeFabric;

public class App {
    public static void main(String[] args) throws Exception {
        itemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        itemGenerator fab2 = new GemFabric();
        fab2.openReward();
        itemGenerator fab3 = new TreeFabric();
        fab3.openReward();
        itemGenerator fab4 = new SulfurFabric();
        fab4.openReward();
        itemGenerator fab5 = new OreFabric();
        fab5.openReward();
        itemGenerator fab6 = new SilverFabric();
        fab6.openReward();
        itemGenerator fab7 = new IronFabric();
        fab7.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<itemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);

        for(int i=0; i<20;i++)
        {
            int index = Math.abs(rnd.nextInt(7));
            fabricList.get(index).openReward();
        }
    }
}
