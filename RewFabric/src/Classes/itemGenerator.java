package Classes;

public abstract class itemGenerator {
  public void openReward()
  {
    iGameItem gameItem = createItem();
    gameItem.open();
  }

  public abstract iGameItem createItem();
}
