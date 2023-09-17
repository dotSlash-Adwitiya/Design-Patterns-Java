
class Document implements Cloneable {

  //* Various attrivutes of a document */
  String content;
  int pageCount;

  Document(String content, int pageCount) {
    this.content = content;
    this.pageCount = pageCount;
  }

  Document(Document docx) {
    this.content = docx.content;
    this.pageCount = docx.pageCount;
  }

  //* DEEP COPY constructor to perform deep-copy */
  public Document clone() throws CloneNotSupportedException{
    Document clonedDocument = (Document) super.clone();
    return clonedDocument;
  }
  public void printContentAndPages(){
    System.out.println(this.content);
    System.out.println(this.pageCount);
  }
}

public class prototypePattern {
  public static void main(String[] args) {
    //* Create a new Document */
    Document originalDoc = new Document("Some Content", 10);
    
    //* Create a copy of document 1 to document 2*/
    Document clonedDoc = new Document(originalDoc);

    //* Print infor on cloned Docx */
    clonedDoc.printContentAndPages();

  }
  
}
