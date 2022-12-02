package entity;

import javax.persistence.*;

@Entity
@Table(name = "Parmak_izi")
public class Parmakizi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "DOSYA_NO",length = 20)
    private String dosyaNo;

    @OneToOne(mappedBy = "parmakizi")
    private Kisi kisi;

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDosyaNo() {
        return dosyaNo;
    }

    public void setDosyaNo(String dosyaNo) {
        this.dosyaNo = dosyaNo;
    }

    public Parmakizi(String dosyaNo) {
        this.dosyaNo = dosyaNo;
    }

    public Parmakizi() {

    }

    public Parmakizi(String dosyaNo, Kisi kisi) {
        this.dosyaNo = dosyaNo;
        this.kisi = kisi;
    }

    @Override
    public String toString() {
        return "Parmakizi{" +
                "id=" + id +
                ", dosyaNo='" + dosyaNo + '\'' +
                ", kisi=" + kisi +
                '}';
    }
}
