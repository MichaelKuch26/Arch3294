package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class SilverFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Silver();
  }
  
}
