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
}
