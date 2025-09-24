import database.DisksDataBase;
import disks.Disk;

public class Main {
    public static void main(String[] args) {
        DisksDataBase db = new DisksDataBase();
        db.generateDisks();

        for (Disk disk : db.getDisks()) {
            System.out.println(disk.getId());
            System.out.println(disk.getName());
            System.out.println(disk.getMemory());
            System.out.println(disk.getJenre());
        }
    }
}