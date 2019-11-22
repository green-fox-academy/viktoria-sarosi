package Blog;

import BlogPost.BlogPost;

import java.util.ArrayList;

public class Blog {
    //Create a Blog class which can
    //store a list of BlogPosts
    //add BlogPosts to the list
    //delete(int) one item at given index
    //update(int, BlogPost) one item at the given index and update it with another BlogPost
    public ArrayList<BlogPost> blogList;

    public Blog(){
        blogList = new ArrayList<>();
    }

    public void add(BlogPost blogPost){
        blogList.add(blogPost);
    }

    public void delete(int n){
        blogList.remove(n);
    }
    public void update(int n, BlogPost blogPost){
        blogList.remove(n);
        blogList.add(n, blogPost);
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < blogList.size(); i++) {
            result += (i + 1) + ". " + blogList.get(i) + "\n";
        }
        return result;
    }
}
