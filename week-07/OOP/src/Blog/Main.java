package Blog;

import BlogPost.BlogPost;

public class Main {
    public static void main(String[] args) {
        Blog firstblog = new Blog();

        BlogPost JD = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost TU = new BlogPost("Tim Urban", "Wait But Why ", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost WT = new BlogPost("Willim Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28");

        firstblog.add(JD);
        firstblog.add(TU);
        firstblog.add(WT);

        firstblog.delete(2);
        System.out.println(firstblog);

        BlogPost DS = new BlogPost("Doman Sije", "Chidusim", "alef, bet, gimel, daled, he, vav", "2020.06.06.");

        firstblog.update(0, DS);
        System.out.println(firstblog);
    }
}
