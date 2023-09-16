package patterns.observer;

import java.util.ArrayList;

/**
 * Класс страницы, на которую будут подписываться подписчики и получать уведомления об обновлениях.
 */
public class Page {
    private ArrayList<Follower> followers;
    String latestPost;

    public Page(){
        followers = new ArrayList<>();

    }
    public void registerFollower (Follower follower) {
        followers.add(follower);
    }
    public void notifyFollowers () {
        for (int i = 0; i < followers.size(); i++) {
            Follower follower = followers.get(i);
            follower.update();
        }
    }

    public String getLatestPost() {
        return latestPost;
    }

    public void addNewPost (String post) {
        this.latestPost = post;
        notifyFollowers();
    }
}
