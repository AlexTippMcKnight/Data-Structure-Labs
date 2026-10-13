public class PrintJob {
    public int id;
    public String doc_name;
    public int pages;

    public PrintJob(int id, String doc_name, int pages) {
        this.id = id;
        this.doc_name = doc_name;
        this.pages = pages;
    }

    public String toString(){
        return doc_name;
    }
}
