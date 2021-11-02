package dades;

import java.io.Serializable;

public class Document implements Serializable {
    static final long serialVersionUID = 1;

    private String identificador;
    private LlistaClients editadors;
    //fitxer
    private String text;

    public Document(String identificador, LlistaClients editadors,String text){
        this.identificador=identificador;
        this.editadors=editadors;
        this.text=text;
    }

    //getters i setters


    public LlistaClients getEditadors() {
        return editadors;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setEditadors(LlistaClients editadors) {
        this.editadors = editadors;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    @Override
    public String toString() {
        return "Document{" +
                "identificador='" + identificador + '\'' +
                ", editadors=" + editadors +
                ", text='" + text + '\'' +
                '}';
    }

    public Document copia() {
        return (new Document(this.identificador, this.editadors, this.text));
    }
}

