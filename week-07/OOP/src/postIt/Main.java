package postIt;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        PostIt idea = new PostIt();
        idea.backgroundcolor = Color.orange;
        idea.text = "Idea 1";
        idea.textColor = Color.blue;

        PostIt aw = new PostIt();
        aw.backgroundcolor = Color.pink;
        aw.text = "Awesome";
        aw.textColor = Color.black;

        PostIt su = new PostIt();
        su.backgroundcolor = Color.yellow;
        su.text = "Superb";
        su.textColor = Color.green;

        System.out.println(idea.text + idea.textColor + idea.backgroundcolor);
    }
}
