package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    private boolean checkIfNull(Post post) {
        boolean üres = false;
        if ((post.getTitle() == null | post.getContent() == null |
                post.getPublishedAt() == null | post.getOwner() == null)) {
            üres = true;
        }
        return üres;
    }

    public List<Post> findPostsFor(String user) {

        Objects.requireNonNull(user, "User must not be Null");
        List<Post> result = new ArrayList<>();
        for (Post x : posts) {
            if (!checkIfNull(x) && user.equals(x.getOwner()) &&
                    x.getPublishedAt().isBefore(LocalDate.now())) {
                result.add(x);
            }
        }
        return result;
    }

}

