package patterns.observer;

public class Official implements Follower {
    String designation;
    private Page page;

    public Official(Page page) {
        this.page = page;
        page.registerFollower(this);
    }

    @Override
    public void update() {
        System.out.println("Latest post seen by a normal official: " + page.getLatestPost());
    }
}
