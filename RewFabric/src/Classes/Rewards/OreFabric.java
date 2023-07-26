package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class OreFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Ore();
  }
  
}
