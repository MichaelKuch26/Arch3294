package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger{
  public List<PoligonalModel> models;
  public List<Scene> scenes;
  public List<Flash> flashes;
  public List<Camera> cameras;
  private iModelChangerObserver[] changerObservers;

  public ModelStore(iModelChangerObserver[] changerObservers) {
    this.changerObservers = changerObservers;
    this.models = new ArrayList<PoligonalModel>();
    this.scenes = new ArrayList<Scene>();
    this.flashes = new ArrayList<Flash>();
    this.cameras = new ArrayList<Camera>();

    
  }

  @Override
  public void notifyChanger(iModelChanger sender) {
    // 
  }

  public Scene getScene(int id){
    return scenes.get(id);
  }
}
