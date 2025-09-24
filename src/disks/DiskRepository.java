package disks;

import java.util.ArrayList;

public class DiskRepository {
    private ArrayList<Disk> disks;

    public DiskRepository(ArrayList<Disk> disks) {
        this.disks = disks;
    }

    public Disk getDiskById(Integer id) {
        return disks.get(id);
    }

    public ArrayList<Disk> getAll() {
        return disks;
    }

    public void create(Disk disk) {
        disks.add(disk);
    }

    public Disk update(Disk disk) {
        for (Disk diskToUpdate : disks) {
            if (diskToUpdate.getId() == disk.getId()) {
                disks.remove(diskToUpdate);
                disks.add(disk);
                return disk;
            }
        }
        return null;
    }

    public void delete(Integer id) {
        for (Disk disk : disks) {
            if (disk.getId() == id) {
                disks.remove(disk);
                break;
            }
        }
    }
}
