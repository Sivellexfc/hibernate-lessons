package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_entity")
public class Pojo {

    @SequenceGenerator(name = "seq2", sequenceName = "ENTİTY_TABLE_ID_SEQ",allocationSize = 10,initialValue = 5)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq2")
    private int id;

    @Column(name = "ISIM")
    private String name;
    @Column(name = "TARIH")
    @Temporal(TemporalType.DATE)
    private Date tarih;
    @Column(name = "SAAT")
    @Temporal(TemporalType.TIME)
    private Date saat;
    @Column(name = "TARIH_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarihSaat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Date getSaat() {
        return saat;
    }

    public void setSaat(Date saat) {
        this.saat = saat;
    }

    public Date getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(Date tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
