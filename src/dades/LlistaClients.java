package dades;

import java.io.Serializable;
import java.util.Arrays;

public class LlistaClients implements Serializable {

    static final long serialVersionUID = 1;

    private int numClients;
    private Clients[] llistaClients;


    public LlistaClients(int maxClients){
        this.numClients=0;
        this.llistaClients= new Clients[maxClients];
    }

    public LlistaClients(){
        this.numClients=0;
        this.llistaClients= new Clients[100];
    }

    @Override
    public String toString(){
        StringBuilder text = new StringBuilder("Llistat de clients: ");
        int i;
        for (i = 0; i < this.numClients; i++) text.append("\n").append(llistaClients[i]);
        return text.toString();
    }

    //GETTERS I SETTERS

    public Clients[] getLlistaClients() {
        return llistaClients;
    }

    public int getNumClients() {
        return numClients;
    }

    public void setLlistaClients(Clients[] llistaClients) {
        this.llistaClients = llistaClients;
    }

    public void setNumClients(int numClients) {
        this.numClients = numClients;
    }

    public void afegirClient(Clients nouClient) {

        this.llistaClients[numClients] = nouClient.copia();    //afegim el producte al final de la llista
        this.numClients++;

    }

}
