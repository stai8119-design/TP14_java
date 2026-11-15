package ma.project.dao;

import ma.project.entities.Identifiable;
import java.util.List;

public interface IDao<T extends Identifiable> {
    boolean create(T o);
    boolean update(T o);
    boolean delete(T o);
    T getById(int id);
    List<T> getAll();
}
