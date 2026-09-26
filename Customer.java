public class Customer {
    private String name;
    private String phone;
    private String address;

    public Customer(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void displayCustomerDetails() {
        System.out.println("\n========== CUSTOMER DETAILS ==========");
        System.out.println("Name    : " + name);
        System.out.println("Phone   : " + phone);
        System.out.println("Address : " + address);
        System.out.println("======================================");
    }
}