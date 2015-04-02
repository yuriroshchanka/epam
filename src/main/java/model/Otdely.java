package model;
// Generated 30.03.2015 11:14:08 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




/**
 * Otdely generated by hbm2java
 */
@Entity
@Table(name = "otdely")
public class Otdely  implements java.io.Serializable {

    @Id
    @Column(name ="ID")
    @GeneratedValue
    private Integer id;
    //@Column(name ="sotrudniki")
    private Sotrudniki sotrudniki;
    @Column(name ="nazvanie")
    private String nazvanie;

    public Otdely() {
    }

	
    public Otdely(Sotrudniki sotrudniki) {
        this.sotrudniki = sotrudniki;
    }
    public Otdely(Sotrudniki sotrudniki, String nazvanie) {
       this.sotrudniki = sotrudniki;
       this.nazvanie = nazvanie;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Sotrudniki getSotrudniki() {
        return this.sotrudniki;
    }
    
    public void setSotrudniki(Sotrudniki sotrudniki) {
        this.sotrudniki = sotrudniki;
    }
    public String getNazvanie() {
        return this.nazvanie;
    }
    
    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }




}

