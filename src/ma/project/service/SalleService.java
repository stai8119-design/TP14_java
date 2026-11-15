package ma.project.service;

import ma.project.dao.IDao;
import ma.project.dao.ListeDao;
import ma.project.entities.Salle;
import java.util.List;

public class SalleService implements IService<Salle> {
    private IDao<Salle> dao = new ListeDao<Salle>();

    @Override
    public boolean ajouter(Salle o) {
        return dao.create(o);
    }

    @Override
    public boolean modifier(Salle o) {
        return dao.update(o);
    }

    @Override
    public boolean supprimer(Salle o) {
        return dao.delete(o);
    }

    @Override
    public Salle getById(int id) {
        return dao.getById(id);
    }

    @Override
    public List<Salle> getAll() {
        return dao.getAll();
    }
}