package Domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="0_TypesPrsns")
public class TypesPersons implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Rfrnc")
    private Long   reference;
    @Column(name="Nm")
    private String name;
    @Column(name="Dscrptn")
    private String description;
    @Column(name="Rfrnc_TypsPrsns")
    private Long   referenceTypesPersons;
    @Column(name="Cndtn")
    private int  condition;
    @Column(name="Rmvd")
    private int  removed;
    @Column(name="Lckd")
    private int  locked;
    @Column(name="DtAdmssn")
    private Date dateAdmission;
    @Column(name="ChckTm")
    private Time checkTime;

    public TypesPersons() {
    }

    public TypesPersons(Long reference, String name, String description, Long referenceTypesPersons, int condition, int removed, int locked, Date dateAdmission, Time checkTime) {
        this.reference             = reference;
        this.name                  = name;
        this.description           = description;
        this.referenceTypesPersons = referenceTypesPersons;
        this.condition             = condition;
        this.removed               = removed;
        this.locked                = locked;
        this.dateAdmission         = dateAdmission;
        this.checkTime             = checkTime;
    }

    public Long getReference() {
        return this.reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReferenceTypesPersons() {
        return this.referenceTypesPersons;
    }

    public void setReferenceTypesPersons(Long referenceTypesPersons) {
        this.referenceTypesPersons = referenceTypesPersons;
    }

    public int getCondition() {
        return this.condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getRemoved() {
        return this.removed;
    }

    public void setRemoved(int removed) {
        this.removed = removed;
    }

    public int getLocked() {
        return this.locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public Date getDateAdmission() {
        return this.dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public Time getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Time checkTime) {
        this.checkTime = checkTime;
    }

    @Override
    public String toString() {
        return "TypesPersons{" + "reference=" + reference + ", name=" + name + ", description=" + description + ", referenceTypesPersons=" + referenceTypesPersons + ", condition=" + condition + ", removed=" + removed + ", locked=" + locked + ", dateAdmission=" + dateAdmission + ", checkTime=" + checkTime + '}';
    }
    
}