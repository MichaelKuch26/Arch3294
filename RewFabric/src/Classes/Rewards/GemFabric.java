package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class GemFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Gem();
  }
  
}
