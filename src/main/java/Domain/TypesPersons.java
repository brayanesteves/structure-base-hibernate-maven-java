package Domain;

import java.sql.Time;
import java.util.Date;

public class TypesPersons {
   
    private Long   reference;
    private String name;
    private String description;
    private Long   referenceTypesPersons;
    private int    removed;
    private int    locked;
    private Date   dateAdmission;
    private Time   checkTime;

    public TypesPersons() {
    }

    public TypesPersons(Long reference, String name, String description, Long referenceTypesPersons, int removed, int locked, Date dateAdmission, Time checkTime) {
        this.reference = reference;
        this.name = name;
        this.description = description;
        this.referenceTypesPersons = referenceTypesPersons;
        this.removed = removed;
        this.locked = locked;
        this.dateAdmission = dateAdmission;
        this.checkTime = checkTime;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReferenceTypesPersons() {
        return referenceTypesPersons;
    }

    public void setReferenceTypesPersons(Long referenceTypesPersons) {
        this.referenceTypesPersons = referenceTypesPersons;
    }

    public int getRemoved() {
        return removed;
    }

    public void setRemoved(int removed) {
        this.removed = removed;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public Date getDateAdmission() {
        return dateAdmission;
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
    
}