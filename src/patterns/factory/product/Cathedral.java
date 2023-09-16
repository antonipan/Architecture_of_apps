package patterns.factory.product;

import patterns.factory.product.Building;

public class Cathedral implements Building {
    @Override
    public void build() {
        System.out.println("Построен собор ");
    }
}
