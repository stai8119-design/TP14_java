package ma.project.com;

import ma.project.entities.Machine;
import ma.project.entities.Salle;
import ma.project.service.MachineService;
import ma.project.service.SalleService;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalleService salleService = new SalleService();
        MachineService machineService = new MachineService();
        Salle s1 = new Salle(1, "A1", "Salle Informatique");
        Salle s2 = new Salle(2, "B2", "Salle de math");
        Salle s3 = new Salle(3, "C1", "Salle de physique");
        salleService.ajouter(s1);
        salleService.ajouter(s2);
        salleService.ajouter(s3);

        Machine m1 = new Machine(1, "PC-LENOVO-10", new Date(), s1);
        Machine m2 = new Machine(2, "PC-ACER-20", new Date(), s2);
        Machine m3 = new Machine(3, "SERV-HP-01", new Date(), s3);

        machineService.ajouter(m1);
        machineService.ajouter(m2);
        machineService.ajouter(m3);

        System.out.println("Machines dans la salle A1");
        List<Machine> machinesA1 = machineService.getMachinesBySalle(1);
        for (int i = 0; i < machinesA1.size(); i++) {
            System.out.println(machinesA1.get(i));
        }

        m1.setRef("MACH-TP-01");
        machineService.modifier(m1);
        System.out.println("Après modification de m1");
        System.out.println(machineService.getById(1));
        machineService.supprimer(m3);
        System.out.println("Liste de toutes les machines après suppression");
        List<Machine> toutes = machineService.getAll();
        for (int i = 0; i < toutes.size(); i++) {
            System.out.println(toutes.get(i));
        }
    }
}
