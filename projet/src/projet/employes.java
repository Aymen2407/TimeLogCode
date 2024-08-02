package projet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("235f6106-00b7-4b46-9a4e-6db0b18fb884")
public class employes {
    @objid ("1de5433b-2f46-4087-b835-e22ba3ae8f1c")
    public String ID;

    @objid ("5b661a10-a624-4b13-89d0-5ae8e3238fdd")
    public String Nom;

    @objid ("cbd2d86b-f385-4c51-af00-11ed479ffc76")
    public Date DateEmbauche;

    @objid ("898625c9-961e-43f0-a644-4315b5259ef7")
    public Date DateDepart;

    @objid ("e2ac95a3-4b03-4d25-b26c-7fa45a3a13fb")
    public int NumeroAssuranceSociale;

    @objid ("d347a796-39e1-4fab-ba20-fe2b8ca0bb64")
    public String Poste;

    @objid ("6907dfb5-36f6-40ef-8165-a1500e322085")
    public float TauxHorairesDeBase;

    @objid ("2606378c-aae8-41bb-ace7-400b24b17e30")
    public float TauxHorairesSupplémentaires;

    @objid ("fba0ce12-6873-4290-932d-ab8a6e7f77d0")
    public List<activites> activites = new ArrayList<activites> ();

    @objid ("036b163a-8f8f-4017-ae29-3121564ba8ae")
    public static void debutActivite() {
    	 System.out.println("Début de l'activité.");
    }

    @objid ("67aa7819-ad44-4d39-8513-f089733bfa98")
    public static void finActivite() {
    }

}
