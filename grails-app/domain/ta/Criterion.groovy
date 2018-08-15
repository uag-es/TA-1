package ta

class Criterion {
	String description
	String hab
	static constraints = {
		hab inList :["Raciocinio Logico", "Criatividade" ,"Interpretacao"], blank :false
		description unique: true, blank: false, nullable: false
	}

	public Criterion(String description, String hab){
		this.description = description
		this.hab = hab
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((hab == null) ? 0 : hab.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Criterion other = (Criterion) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (hab == null) {
			if (other.hab != null)
				return false;
		} else if (!hab.equals(other.hab))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Criterion [description=" + description + ", hab=" + hab + "]";
	}
}
