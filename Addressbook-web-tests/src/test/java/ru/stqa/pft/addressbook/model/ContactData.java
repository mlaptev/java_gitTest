package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobilephone;
    private final String workphone;
    private final String faxnumber;
    private final String email;
    private final String email12;
    private final String email13;
    private final String birthyear;
    private final String anniversaryyear;
    private final String address2;
    private final String homephone2;
    private final String notes;
    private String group;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String mobilephone, String workphone, String faxnumber, String email, String email12, String email13, String birthyear, String anniversaryyear, String address2, String homephone2, String notes, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobilephone = mobilephone;
        this.workphone = workphone;
        this.faxnumber = faxnumber;
        this.email = email;
        this.email12 = email12;
        this.email13 = email13;
        this.birthyear = birthyear;
        this.anniversaryyear = anniversaryyear;
        this.address2 = address2;
        this.homephone2 = homephone2;
        this.notes = notes;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail12() {
        return email12;
    }

    public String getEmail13() {
        return email13;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getAnniversaryyear() {
        return anniversaryyear;
    }

    public String getAddress2() {
        return address2;
    }

    public String getHomephone2() {
        return homephone2;
    }

    public String getNotes() {
        return notes;
    }

    public String getGroup() {
        return group;
    }
}
