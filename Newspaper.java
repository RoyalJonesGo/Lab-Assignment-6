public class Newspaper implements LibraryResource{
    private String title;

    public Newspaper(String title){
        this.title = title;
    }
    @Override
    public String getTitle(){
        return title;
    }
}
