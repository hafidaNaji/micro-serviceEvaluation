package net.naji.beneficiaireservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import net.naji.beneficiaireservice.modele.BeneficiaireType;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Beneficiaire {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long identifiant;
    private String nom;
    private  String prenom;
    private String rib;
    private BeneficiaireType type; // Phisique ou Morale

}
