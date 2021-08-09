package me.kirtish.elearning.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contact {


    @Column
    @Id
    @SequenceGenerator(
            name="contactIdSeq",
            initialValue=1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="contactIdSeq"
    )

    Long Contactid;
    String message;


    public Contact(Long contactid, String message) {
        Contactid = contactid;
        this.message = message;
    }

    public Long getContactid() {
        return Contactid;
    }

    public void setContactid(Long contactid) {
        Contactid = contactid;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(Contactid, contact.Contactid)  && Objects.equals(message, contact.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Contactid, message);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Contactid=" + Contactid +
                ", message='" + message + '\'' +
                '}';
    }
}
