package saim.lab7;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class person {

    @Id
    int id;

    String name;
    String fatherName;
    String organization;
    String mobile;


    /*
     * Constructors
     */
    public person() {
    }

    public person(String name, String fatherName, String organization, String mobile) {
        this.name = name;
        this.fatherName = fatherName;
        this.organization = organization;
        this.mobile = mobile;
    }



    /*
     * Getters and Setters for all attributes
     */
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
