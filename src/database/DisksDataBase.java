package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import disks.Disk;

public class DisksDataBase {
    private ArrayList<Disk> disks;

    private Integer id;
    Random rnd = new Random();

    private ArrayList<String> names = new ArrayList<>(List.of("Титаник", "Винкс 3 сезон", "Король лев", "formula 1", "Worldof tanks"));
    private ArrayList<String> jenres = new ArrayList<>(List.of("Фильм", "Сериал", "Игра на PS3"));

    public ArrayList<Disk> getDisks() {
        return disks;
    }

    public DisksDataBase() {
        this.id = 1;
        this.disks = new ArrayList<>();
    }

    public ArrayList<Disk> generateDisks() {
        for (int i = 0; i < 15; i++) {
            Integer diskId = id;
            String name = names.get(i % 5);
            Double memory = rnd.nextDouble(2560) / 10 ;
            String jenre = jenres.get(i % 3);

            Disk disk = new Disk(id, name, memory, jenre);
            disks.add(disk);
            id++;
        }
        return disks;
    }
}
