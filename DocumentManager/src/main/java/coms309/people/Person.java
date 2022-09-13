package coms309.people;



public class Person {

    private String documentName;

    private String path;

    private String folder;

    private int documentId;

    private String documentOwner;

    public Person(){
        
    }

    public Person(String documentName, String path, String folder, int documentId, String documentOwner){
        this.documentName= documentName;
        this.path=path;
        this.folder=folder;
        this.documentId=documentId;
        this.documentOwner=documentOwner;
    }


    public String getDocumentName() {
        return this.documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path=path;
    }

    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
        this.folder=folder;
    }

    public int getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId=documentId;
    }

    public String getDocumentOwner() {
        return this.folder;
    }

    public void setDocumentOwner(String documentOwner) {
        this.documentOwner=documentOwner;
    }

    @Override
    public String toString() {
        return documentName + " "
               + path + " "
               + folder + " "
               + documentId+" "+documentOwner;
    }
}
