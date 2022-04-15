package gestoin_notes;

public class etudiant implements Comparable<etudiant> {
	int id;String nom;double note;
	etudiant(int id,String nom){
		this.id=id;this.nom=nom;this.note=10;
	}
	public String toString() {
			return nom+":"+note; 
		 }
	public boolean equals(Object obj) {
		 if (obj instanceof etudiant) {
				etudiant a=(etudiant)obj ;
				return this.id==a.id;
				}
		 return false;
	 }
	@Override
	public int compareTo(etudiant e) {
		if(this.note==e.note) {
			return 0;
		}
		if(this.note>e.note) {
			return 1;
		}
		return -1;
	}
	public void changenote(int note) {
		this.note=note;
	}
	public double getnote(){
		return this.note;
	}
}
