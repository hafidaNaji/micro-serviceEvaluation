package net.naji.virementservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.naji.beneficiaireservice.entities.Beneficiaire;
import net.naji.virementservice.modele.TypeVirement;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Virement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String source;
    private double montant;
    private String description;
    private LocalDateTime date;
    private TypeVirement typeVirement;
    @ManyToOne
    private Beneficiaire beneficiaire;

}
