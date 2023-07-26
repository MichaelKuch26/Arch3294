package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class GoldFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Gold();
  }
  
}
