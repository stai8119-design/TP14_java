package ma.project.entities;

import java.util.List;
import java.util.ArrayList;

public class Salle implements Identifiable {
    private int id;
    private String code;
    private String libelle;
    private List<Machine> machines;

    public Salle(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
        this.machines = new ArrayList<Machine>();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCode() { 
    	return code; 
    }
    
    public void setCode(String code) { 
    	this.code = code;
    }

    public String getLibelle() { 
    	return libelle; 
    }
    public void setLibelle(String libelle) { 
    	this.libelle = libelle; 
    }

    public List<Machine> getMachines() { 
    	return machines; 
    }
    public void setMachines(List<Machine> machines) { 
    	this.machines = machines; 
    }

    @Override
    public String toString() {
        return "Salle [id de la salle est:" + id + ", son code est:" + code + ", le libelle est :" + libelle + "]";
    }
}
