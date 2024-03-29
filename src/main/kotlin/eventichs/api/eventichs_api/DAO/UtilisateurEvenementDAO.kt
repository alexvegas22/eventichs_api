package eventichs.api.eventichs_api.DAO

import eventichs.api.eventichs_api.Modèle.Participant
import eventichs.api.eventichs_api.Modèle.Utilisateur
import eventichs.api.eventichs_api.Modèle.UtilisateurÉvénement
import eventichs.api.eventichs_api.Modèle.Événement

interface UtilisateurEvenementDAO : DAO<UtilisateurÉvénement> {

    override fun chercherTous(): List<UtilisateurÉvénement>
    fun chercherParUtilisateurID(id: String): List<Événement>
    fun chercherParEvenementID(id: Int): List<Participant>

    fun supprimerParID(id : Int, name : String) : UtilisateurÉvénement?
    override fun ajouter(element: UtilisateurÉvénement): UtilisateurÉvénement?
    fun validerUtilisateur( eventId: Int, codeUtilisateur: String): Boolean
}
