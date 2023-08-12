package patterns.factory.creator;

import patterns.factory.product.Building;
import patterns.factory.product.Cathedral;

public class CathedralCreater implements CreatorBuilding {
    @Override
    public Building createBuilding() {
        return new Cathedral();
    }
}
