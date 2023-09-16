package patterns.observer;

public class Main {
    public static void main(String[] args) {

        Page page = new Page();
        page.addNewPost("I am feeling lucky!");

        User user = new User(page);
        page.addNewPost("It's a beautiful day!");

        Recruter recruiter = new Recruter(page);
        Official official = new Official(page);
        page.addNewPost("Ready to go for a run!!");

    }
}
