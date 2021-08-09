package me.kirtish.elearning.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class User implements Serializable {
    @Id
    @SequenceGenerator(name="mysequence", initialValue=101,allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mysequence")
    @Column(name = "user_id",nullable = false,updatable = false)
   private Long id;
   private String name;
   private Long phone_no;
    private String email;
    private String address;
    private String reg_date;
    private String password;
    private String upload_photo;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id"
    )
    private List<Contact> contacts;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id"
    )
    private List<Feedback> feedbacks;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Long phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpload_photo() {
        return upload_photo;
    }

    public void setUpload_photo(String upload_photo) {
        this.upload_photo = upload_photo;
    }



    public User(Long id, String name, Long phone_no, String email, String address, String reg_date, String password, String upload_photo) {
        this.id = id;
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
        this.address = address;
        this.reg_date = reg_date;
        this.password = password;
        this.upload_photo = upload_photo;
    }


    public User() {}

@Override
    public String toString() {
   return "User { " +
           "id = " + id + "\n" +
           "name = "+ name + "\n" +
           "email = "+ email + "\n"+
           "phone number = "+ phone_no + "\n" +
           "address = "+ address + "\n" +
           "uploaded image = "+ upload_photo + "}";
}
}

