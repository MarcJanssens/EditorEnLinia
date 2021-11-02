package dades;


import java.io.Serializable;

public class Clients implements Serializable {

    static final long serialVersionUID = 1;

    private String nomUsuari;
    private String contrassenya;


    public Clients(String nomUsuari, String contrassenya){
        this.nomUsuari=nomUsuari;
        this.contrassenya=contrassenya;

    }

}
