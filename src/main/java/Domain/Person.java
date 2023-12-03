package Domain;

import java.sql.Time;
import java.util.Date;

public class Person {
    
    private Long reference;
    private Long referencePerson;
    private Long referenceTypePerson;
    private int  condition;
    private int  removed;
    private int  locked;
    private Date dateAdmission;
    private Time checkTime;

    public Person() {
    }

    public Person(Long reference, Long referencePerson, Long referenceTypePerson, int condition, int removed, int locked, Date dateAdmission, Time checkTime) {
        this.reference = reference;
        this.referencePerson = referencePerson;
        this.referenceTypePerson = referenceTypePerson;
        this.condition = condition;
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

    public Long getReferencePerson() {
        return referencePerson;
    }

    public void setReferencePerson(Long referencePerson) {
        this.referencePerson = referencePerson;
    }

    public Long getReferenceTypePerson() {
        return referenceTypePerson;
    }

    public void setReferenceTypePerson(Long referenceTypePerson) {
        this.referenceTypePerson = referenceTypePerson;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
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