package data;

public class Customer {
    private String name;
    private long phoneNumber;
    private String emailId;
    private String address;
    private boolean premiumMember;

    public Customer() {
        this.name = "john";
        this.phoneNumber = 875469558;
        this.emailId = "john123@gmail.com";
        this.address = "Dhampur Bijnor";
        this.premiumMember = true;
    }

    public Customer(String name, long phoneNumber, String emailId, String address, boolean primumMemer) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        premiumMember = primumMemer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premiumMember) {
        this.premiumMember = premiumMember;
    }

    public void displayCustomer() {
        System.out.println("name = " + name);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("emailId = " + emailId);
        System.out.println("address = " + address);
        System.out.println("primumMemer = " + premiumMember);
    }
}
