package JavaProgram_no_4_12_7_2021;

public class Address {
    private String country;

    public String getCountry() {
        return country;
    }

    public Address(String country, String city, String street, String zipCode, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.houseNumber = houseNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    private String city;
    private String street;
    private String zipCode;
    private int houseNumber;
}
