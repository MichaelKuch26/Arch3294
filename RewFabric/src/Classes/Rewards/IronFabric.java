package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class IronFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Iron();
  }
  
}
