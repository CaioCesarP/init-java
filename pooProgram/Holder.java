package pooProgram;
public class Holder {
	private String name;
	private String taxId;
	private String profession;

	/**
	 * @param name
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param taxId
	 * @return void
	 */
	public void setTaxId(String taxId) {
		if (taxId.length() != 11) {
			System.out.println("Review your tax id. Valid tax id contains 11 digits.");
			return;
		}

		this.taxId = taxId;
		System.out.println("Tax id successfully added");
	}

	/**
	 * @return String
	 */
	public String getTaxId() {
		return this.taxId;
	}

	/**
	 * @param profession
	 * @return void
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return String
	 */
	public String getProfession() {
		return this.profession;
	}
}
