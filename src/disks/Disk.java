package disks;

public class Disk {
    private Integer id;
    private String name;
    private Double memory;
    private String jenre;

    public Disk(Integer id, String name, Double memory, String jenre) {
        this.id = id;
        this.name = name;
        this.memory = memory;
        this.jenre = jenre;
    }

    public Disk() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public String getJenre() {
        return jenre;
    }

    public void setJenre(String jenre) {
        this.jenre = jenre;
    }
}
