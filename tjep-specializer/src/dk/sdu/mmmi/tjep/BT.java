package dk.sdu.mmmi.tjep;

public class BT {

	private String label;
	
	private BT(String label) { this.label = label; }
	
	public String toString() { return label; }
	
	public static final BT S = new BT("S");
	public static final BT D = new BT("D");
	public static final BT Bot = new BT("Bot");
	public static final BT Top = new BT("Top");

	@Override
	public boolean equals(Object obj) {
		if(this==Top || obj==Top) return true;
		// Auto-generated
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BT other = (BT) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

	// Auto-generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		return result;
	}


}
