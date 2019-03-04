package rocks.zipcode.assessment2.objectorientation;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private Map<String, String> address;

    public Address() {
        this("", "", "", "", "");
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        address = new TreeMap<>();
        address.put("addressLine1", addressLine1);
        address.put("addressLine2", addressLine2);
        address.put("city", city);
        address.put("state", state);
        address.put("zipcode", zipcode);
    }

    public String getAddressLine1() {
        return address.get("addressLine1");
    }

    public void setAddressLine1(String addressLine1) {
        address.put("addressLine1", addressLine1);
    }

    public String getAddressLine2() {
        return address.get("addressLine2");
    }

    public void setAddressLine2(String addressLine2) {
        address.put("addressLine2", addressLine2);
    }

    public String getCity() {
        return address.get("city");
    }

    public void setCity(String city) {
        address.put("city", city);
    }

    public String getState() {
        return address.get("state");
    }

    public void setState(String state) {
        address.put("state", state);
    }

    public String getZipcode() {
        return address.get("zipcode");
    }

    public void setZipcode(String zipcode) {
        address.put("zipcode", zipcode);
    }

    public boolean equals(Address a) {
        return address.equals(a.address);
    }

    @Override
    public String toString() {
        return "Address" + address.toString().replaceAll("=", "='").replaceAll(",", "',").replaceAll("[}]", "'}");
    }
}
