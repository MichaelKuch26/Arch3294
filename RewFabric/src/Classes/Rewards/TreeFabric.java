package Classes.Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class TreeFabric extends itemGenerator{

  @Override
  public iGameItem createItem() {
    return new Tree();
  }
  
}
