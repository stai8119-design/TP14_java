package ma.project.service;

import ma.project.dao.IDao;
import ma.project.dao.ListeDao;
import ma.project.entities.Machine;
import java.util.List;
import java.util.ArrayList;

public class MachineService implements IService<Machine> {
    private IDao<Machine> dao = new ListeDao<Machine>();

    @Override
    public boolean ajouter(Machine o) {
        return dao.create(o);
    }

    @Override
    public boolean modifier(Machine o) {
        return dao.update(o);
    }

    @Override
    public boolean supprimer(Machine o) {
        return dao.delete(o);
    }

    @Override
    public Machine getById(int id) {
        return dao.getById(id);
    }

    @Override
    public List<Machine> getAll() {
        return dao.getAll();
    }

    public List<Machine> getMachinesBySalle(int salleId) {
        List<Machine> resultat = new ArrayList<Machine>();
        List<Machine> toutes = dao.getAll();
        for (int i = 0; i < toutes.size(); i++) {
            Machine m = toutes.get(i);
            if (m.getSalle() != null && m.getSalle().getId() == salleId) {
                resultat.add(m);
            }
        }
        return resultat;
    }
}
