package entity;
import javax.persistence.*;

@Entity
@Table(name = "Kisi")
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "isim",length = 100)
    private String name;

    @OneToOne()
    @JoinColumn(name = "parmakId")
    private Parmakizi parmakizi;

    public Kisi(String name, Parmakizi parmakizi) {
        this.name = name;
        this.parmakizi = parmakizi;
    }

    public Kisi() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parmakizi getParmakizi() {
        return parmakizi;
    }

    public void setParmakizi(Parmakizi parmakizi) {
        this.parmakizi = parmakizi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parmakizi=" + parmakizi +
                '}';
    }
}
