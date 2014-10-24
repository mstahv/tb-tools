package org.vaadin.tb.tools;

import java.io.Serializable;
import java.util.Date;

/**
 * A domain object example. In a real application this would probably be a JPA
 * entity or DTO.
 */
public class PhoneBookEntry implements Serializable, Cloneable {

    private String name;

    private String number;

    private String email;

    private Date birthDate;

    public PhoneBookEntry(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public PhoneBookEntry() {
        this("", "", "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
