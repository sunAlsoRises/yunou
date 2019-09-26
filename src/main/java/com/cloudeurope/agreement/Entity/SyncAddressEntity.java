package com.cloudeurope.agreement.Entity;

//订单同步
public class SyncAddressEntity extends PublicEntity {

/*
    SN	        36字节（string）	同步流水号UUID
    Username	10字节（string）	用户账号
    AddressSN	36字节（string）	地址流水号UUID
    Country	    60字节（string）	国家
    Province	60字节（string）	省份
    City	    60字节（string）	城市
    District	60字节（string）	地区
    Address	    120字节（string）	详细地址
    ZipCode	    6字节（string）	    邮编
    Contact	    30字节（string）	联系人
    Tel	        20字节（string）	联系电话
    Mobile	    11字节（string）	手机
*/
    //同步流水号UUID （36字节）
    private String SN;
    //用户账号（10字节）
    private String Username;
    //地址流水号UUID（36字节）
    private String AddressSN;
    //国家（60字节）
    private String Country;
    //省份（60字节）
    private String Province;
    //城市（60字节）
    private String City;
    //地区（60字节）
    private String District;
    //详细地址（120字节）
    private String Address;
    //邮编（6字节）
    private String ZipCode;
    //联系人（30字节）
    private String Contact;
    //联系电话（20字节）
    private String Tel;
    //手机（11字节）
    private String Mobile;

    //-------------------------

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getAddressSN() {
        return AddressSN;
    }

    public void setAddressSN(String addressSN) {
        AddressSN = addressSN;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
