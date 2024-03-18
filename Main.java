class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor
    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    // Override clone method
    @Override
    public Organization clone() throws CloneNotSupportedException {
        return (Organization) super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Organization org1 = new Organization(1, "Org1", "Address1");
        Organization org2 = org1.clone(); // Cloning org1 to org2

        // Printing details of both objects
        System.out.println("Details of org1:");
        org1.printDetails();
        System.out.println("\nDetails of org2 (Cloned from org1):");
        org2.printDetails();
    }
}
