package disks;

public class DiskService {
    DiskRepository repository;

    public DiskService(DiskRepository repository) {
        this.repository = repository;
    }

    public void delete(Integer id) {
        repository.delete(id);
        /// операции с данными
    }
}
