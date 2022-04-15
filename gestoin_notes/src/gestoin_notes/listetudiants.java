package gestoin_notes;

import java.util.ArrayList;
import java.util.List;
import gestoin_notes.etudiant;

public class listetudiants extends ArrayList<etudiant> {
	private List<etudiant> j;
	public boolean add(etudiant e) {
		if(this.contains(e)) {
	    	super.set(indexOf(e),e);
	    	return false;
	    }super.add(e);
		return true;
	}
	public List<etudiant> filtrer(condition c){
		j = null;
		for(int i=0;i<size();i++) {
			if(c.estVrai(this.get(i))) {
				j.add(this.get(i));
			}
		}
		return j;
		
	}
}
