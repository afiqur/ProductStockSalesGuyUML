package ARP;

public class SalesGuy {
	private int salesid;
	private String name;
	private String designation;
	private String cell;
	private String email;

	public SalesGuy(int salesid, String name, String designation, String cell, String email) {
		this.salesid = salesid;
		this.name = name;
		this.designation = designation;
		this.cell = cell;
		this.email = email;
	}

	public void display() {
		System.out.println("Sales Id: " + salesid + " Sales Guy Name: " + name + " Sales Guy Designation: "
				+ designation + " Sales Guy Cell: " + cell + " Sales Guy Email: " + email);
	}

}
