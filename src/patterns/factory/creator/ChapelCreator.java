package patterns.factory.creator;

import patterns.factory.product.Building;
import patterns.factory.product.Chapel;

public class ChapelCreator implements CreatorBuilding {
    @Override
    public Building createBuilding() {
        return new Chapel();
    }
}
