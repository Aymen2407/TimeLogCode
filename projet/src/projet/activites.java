package projet;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("40f5f1cd-3363-4f42-9718-5fb1ba7adf75")
public class activites {
    @objid ("b1ceb56d-fcd2-49f9-a5b0-5c0cfe466353")
    public String ID;

    @objid ("cb23646e-07d8-425a-800a-971dd9a3db4c")
    public projets Projet;

    @objid ("f7b965ab-8e4f-4e11-b852-16359e11e1ae")
    public employes Employé;

    @objid ("733aff02-bcf1-4a1f-9ecc-85bfe7a48c8c")
    public String Discipline;

    @objid ("78765a70-301a-4cce-83f9-318ba4f29ef4")
    public float HeureDébut;

    @objid ("08943942-874c-4208-8fab-234b7a80c5ef")
    public float HeureFin;

    @objid ("c8b01feb-2057-4c09-9805-9099a1e12a18")
    public List<projets> projets = new ArrayList<projets> ();

    @objid ("53507b4d-8cf4-45c6-92e7-22d7ce0446c7")
    public toJson toJson;

    @objid ("c152cc18-1822-47ba-83b8-331284dcdf74")
    public void choixProjet() {
    }

    @objid ("1eaba076-e024-4f98-bcdf-052ddd0c8ec8")
    public void choixDiscipline() {
    }

}
