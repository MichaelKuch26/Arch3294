package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class SulfurFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Sulfur();
  }
  
}
