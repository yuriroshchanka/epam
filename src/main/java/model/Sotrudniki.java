package model;
// Generated 30.03.2015 11:14:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sotrudniki generated by hbm2java
 */
@Entity
@Table(name = "sotrudniki")
public class Sotrudniki  implements java.io.Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Column(name = "familiya")
    private String familiya;
    @Column(name ="imia")
    private String imia;
    @Column(name ="otchestvo")
    private String otchestvo;
    @Column(name ="zarplata")
    private Integer zarplata;
    private Set otdelies = new HashSet(0);

    public Sotrudniki() {
    }

	
    public Sotrudniki(String familiya, String imia) {
        this.familiya = familiya;
        this.imia = imia;
    }
    public Sotrudniki(String familiya, String imia, String otchestvo, Integer zarplata, Set otdelies) {
       this.familiya = familiya;
       this.imia = imia;
       this.otchestvo = otchestvo;
       this.zarplata = zarplata;
       this.otdelies = otdelies;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFamiliya() {
        return this.familiya;
    }
    
    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }
    public String getImia() {
        return this.imia;
    }
    
    public void setImia(String imia) {
        this.imia = imia;
    }
    public String getOtchestvo() {
        return this.otchestvo;
    }
    
    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }
    public Integer getZarplata() {
        return this.zarplata;
    }
    
    public void setZarplata(Integer zarplata) {
        this.zarplata = zarplata;
    }
    public Set getOtdelies() {
        return this.otdelies;
    }
    
    public void setOtdelies(Set otdelies) {
        this.otdelies = otdelies;
    }




}

