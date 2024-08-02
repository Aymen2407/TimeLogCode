package projet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c5f5078c-5936-4387-876c-bf3f7847f170")
public class projets {
    @objid ("154be8a8-4b68-466a-8fb1-2b869069ce1f")
    public String ID;
  
    @objid ("06981a8b-acfa-44cb-a24b-9584ce6733e7")
    public String Nom;

    @objid ("fea22f72-53c4-41e2-a705-953ec2096dff")
    public Date DateDébut;

    @objid ("1ea39762-6c22-4c3c-a23d-a7f4e31aae1e")
    public Date DateFin;

    @objid ("f1ed797a-337a-43cc-bf6d-3c1ab661bc7a")
    public float HeuresBugetées;

    @objid ("40e8b5cd-18f4-4dec-ba1e-4c543ea7389f")
    public List<activites>  = new ArrayList<activites> ();

}
