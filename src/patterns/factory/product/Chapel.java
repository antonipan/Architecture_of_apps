package patterns.factory.product;

import patterns.factory.product.Building;

public class Chapel implements Building {
    @Override
    public void build() {
        System.out.println("Построена часовня");
    }
}
