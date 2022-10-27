package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	private int plID;
	private String plName;

	public ProgrammingLanguage() {

	}

	public ProgrammingLanguage(int plID, String plName) {

		this.plID = plID;
		this.plName = plName;
	}

	public int getPlID() {
		return plID;
	}

	public void setPlID(int plID) {
		this.plID = plID;
	}

	public String getPlName() {
		return plName;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

}
