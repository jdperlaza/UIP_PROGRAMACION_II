package sample;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by JHOAN PERLAZA on 15/4/16.
 */
public class UsuariosLista {

    private SimpleStringProperty  nombre = new SimpleStringProperty();
    private SimpleStringProperty nota = new SimpleStringProperty();

    public  void setNombre(String nom){
        this.nombre.set(nom);
    }
    public  void setNota(String nt){
        this.nota.set(nt);
    }
    public String getNombre(){
        return  this.nombre.get();
    }
    public String getNota(){
        return  this.nota.get();
    }

}
