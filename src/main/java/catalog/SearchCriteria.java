package catalog;

public class SearchCriteria {

    private final String contributor;
    private final String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String contributor, String title){
        if(Validators.isBlank(contributor) || Validators.isBlank(title)){
            throw new IllegalArgumentException("I need parameters");
        }
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByContributor(String contributor){
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("I need contributor parameter");
        }
        return new SearchCriteria(contributor,"");
    }

    public static SearchCriteria createByTitle(String title){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("I need title parameter");
        }
        return new SearchCriteria("", title);
    }

    public boolean hasContributor(){
        if(contributor==null || contributor.length()==0) return false;
        return true;
    }

    public boolean hasTitle(){
        if(title==null || title.length()==0) return false;
        return true;
    }

}
