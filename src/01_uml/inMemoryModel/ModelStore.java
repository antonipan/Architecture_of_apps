package homework01.inMemoryModel;

import homework01.modelElements.Camera;
import homework01.modelElements.Flash;
import homework01.modelElements.PoligonalModel;
import homework01.modelElements.Scene;


import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List <PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List <Camera> cameras;
    private List <ModelChangeObserver> changeObservers;

    public ModelStore(List<ModelChangeObserver> changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.scenes = new ArrayList<>();
        //Так же в каждый список нужно добавить по элементу,об этом нам говорит связь между элементами

    }

    public Scene getScene (int number){
        return scenes.get(number);
    }
    @Override
    public void notifyChange (IModelChanger iModelChanger){};
}
