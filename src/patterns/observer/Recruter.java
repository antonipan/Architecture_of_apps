package patterns.observer;

public class Recruter implements Follower {
    String company;
    private Page page;

    public Recruter(Page page) {
        this.page = page;
        page.registerFollower(this);
    }

    @Override
    public void update() {
        System.out.println("Latest post seen by a normal recruiter: " + page.getLatestPost());

    }
}
