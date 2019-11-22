package BlogPost;

public class BlogPost {
    public String authorName;
    public String title;
    public String text;
    public String publicationDate;


    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
    public void speak (){
        System.out.println(this.authorName + " " + this.title + " " + this.text + " " + this.publicationDate);
    }
    @Override
    public String toString(){
        return (authorName) + " : " + (title);
    }
}
