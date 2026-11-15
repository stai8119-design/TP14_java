package ma.project.service;

import ma.project.entities.Identifiable;
import java.util.List;

public interface IService<T extends Identifiable> {
    boolean ajouter(T o);
    boolean modifier(T o);
    boolean supprimer(T o);
    T getById(int id);
    List<T> getAll();
}
