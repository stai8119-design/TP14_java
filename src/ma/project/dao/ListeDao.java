package ma.project.dao;

import ma.project.entities.Identifiable;
import java.util.ArrayList;
import java.util.List;

public class ListeDao<T extends Identifiable> implements IDao<T> {
    
	private List<T> storage = new ArrayList<T>();

    @Override
    public boolean create(T o) {
        if (o != null && getById(o.getId()) == null) {
            return storage.add(o);
        }
        return false;
    }

    @Override
    public boolean update(T o) {
        if (o != null) {
            for (int i = 0; i < storage.size(); i++) {
                if (storage.get(i).getId() == o.getId()) {
                    storage.set(i, o);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(T o) {
        if (o != null) {
            return storage.remove(o);
        }
        return false;
    }

    @Override
    public T getById(int id) {
        for (int i = 0; i < storage.size(); i++) {
            T item = storage.get(i);
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return storage;
    }
}
