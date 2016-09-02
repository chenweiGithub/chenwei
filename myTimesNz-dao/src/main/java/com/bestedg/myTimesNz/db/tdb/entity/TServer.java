package com.bestedg.myTimesNz.db.tdb.entity;

public class TServer {
    private Integer id;

    private String realname;

    private Byte ageGroup;

    private String address;

    private String personalPhoto;

    private String passportPhoto;

    private String foreignIdPhoto;

    private Integer userBasicId;

    private Integer cityId;

    private Integer countryId;

    private String servicePhoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Byte getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(Byte ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPersonalPhoto() {
        return personalPhoto;
    }

    public void setPersonalPhoto(String personalPhoto) {
        this.personalPhoto = personalPhoto == null ? null : personalPhoto.trim();
    }

    public String getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(String passportPhoto) {
        this.passportPhoto = passportPhoto == null ? null : passportPhoto.trim();
    }

    public String getForeignIdPhoto() {
        return foreignIdPhoto;
    }

    public void setForeignIdPhoto(String foreignIdPhoto) {
        this.foreignIdPhoto = foreignIdPhoto == null ? null : foreignIdPhoto.trim();
    }

    public Integer getUserBasicId() {
        return userBasicId;
    }

    public void setUserBasicId(Integer userBasicId) {
        this.userBasicId = userBasicId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getServicePhoneNumber() {
        return servicePhoneNumber;
    }

    public void setServicePhoneNumber(String servicePhoneNumber) {
        this.servicePhoneNumber = servicePhoneNumber == null ? null : servicePhoneNumber.trim();
    }
}