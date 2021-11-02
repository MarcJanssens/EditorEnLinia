package dades;

public class LlistaDocuments {
    static final long serialVersionUID = 1;

    private int numDocuments;
    private Document[] llistaDocuments;


    public LlistaDocuments(int maxDocuments){
        this.numDocuments=0;
        this.llistaDocuments= new Document[maxDocuments];
    }

    public LlistaDocuments(){
        this.numDocuments=0;
        this.llistaDocuments= new Document[100];
    }

    @Override
    public String toString(){
        StringBuilder text = new StringBuilder("Llistat de clients: ");
        int i;
        for (i = 0; i < this.numDocuments; i++) text.append("\n").append(llistaDocuments[i]);
        return text.toString();
    }

    //GETTERS I SETTERS

    public Document[] getLlistaDocuments() {
        return llistaDocuments;
    }

    public int getNumDocuments() {
        return numDocuments;
    }

    public void setLlistaDocuments(Document[] llistaDocuments) {
        this.llistaDocuments = llistaDocuments;
    }

    public void setNumDocuments(int numDocuments) {
        this.numDocuments = numDocuments;
    }

    public void afegirClient(Document nouDocuments) {

        this.llistaDocuments[numDocuments] = nouDocuments.copia();    //afegim el producte al final de la llista
        this.numDocuments++;

    }

}
