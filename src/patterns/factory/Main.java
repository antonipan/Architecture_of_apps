package patterns.factory;

import patterns.factory.creator.CathedralCreater;
import patterns.factory.creator.ChapelCreator;
import patterns.factory.creator.CreatorBuilding;
import patterns.factory.product.Building;

public class Main {
    public static void main(String[] args) {
        CreatorBuilding build = getCreatorBuilding("cathedral");
        Building building = build.createBuilding();
        building.build();
    }

    public static CreatorBuilding getCreatorBuilding (String creator) {
        if (creator.equals("chapel")) {
            return new ChapelCreator();
        } else if (creator.equals("cathedral")) {
            return new CathedralCreater();
        } else {
            throw new RuntimeException("Ещё не разработан такой фукнционал. ");
        }
    }
}


