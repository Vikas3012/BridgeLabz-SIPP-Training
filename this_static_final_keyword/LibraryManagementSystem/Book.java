public  class Book{
     static String libraryName = "Babu lal Library";

     private final String isbn;

     private String title;

     private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static  void displayLibraryName(){
        System.out.println("Library name is :- "+libraryName);
    }
    public  void displayDetails(){
        if(this instanceof Book){
            System.out.println("title :- "+ title);
            System.out.println("author :- "+author);
            System.out.println("ISBN :- "+isbn);
        }else{
            System.out.println("Not a valid book object");
        }
    }
}