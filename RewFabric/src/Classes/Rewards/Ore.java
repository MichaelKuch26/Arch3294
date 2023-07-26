package Classes.Rewards;

import Classes.iGameItem;

public class Ore implements iGameItem{

  @Override
  public void open() {
    System.out.println("Ore!");
  }
}
