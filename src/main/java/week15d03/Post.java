package week15d03;

import java.time.LocalDate;

public class Post {

    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;


    public Post(String title, LocalDate publishedAt, String content, String owner) {
        this.title = title;
        this.publishedAt = publishedAt;
        this.content = content;
        this.owner = owner;
    }


    public String getTitle() {
        return title;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", publishedAt=" + publishedAt +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
/*Adott az alábbi osztály:
java
public class Post {
    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;
}
Implementáljunk a PostFinder osztályban egy public List<Post> findPostsFor(String user)
metódust az alábbi módon:
- Csak olyan Post-ot adjunk vissza, amelynek az owner-e megegyezik a megadott user-rel
- A Post publishedAt dátuma korábbi kell, hogy legyen, mint a LocalDate.now()
- A content és a title nem lehet üres
Tároljunk egy List<Post> objektumot a PostFinder osztályban, melyet
konstruktor paraméterként kap meg és ezt használjuk! (edited)
9:06
Ide várom a junior/medior kérdéseket!

!*/