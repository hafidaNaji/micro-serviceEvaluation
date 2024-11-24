package net.naji.beneficiaireservice;

import net.naji.beneficiaireservice.entities.Beneficiaire;
import net.naji.beneficiaireservice.modele.BeneficiaireType;
import net.naji.beneficiaireservice.repository.BeneficiaireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeneficiaireServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiaireServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BeneficiaireRepository beneficiaireRepository){
        return args -> {
            beneficiaireRepository.save(Beneficiaire.builder()
                    .nom("Naji")
                    .prenom("Mohamed")
                    .rib("1111111111111111")
                    .type(BeneficiaireType.MORALE)
                    .build());

            beneficiaireRepository.save(Beneficiaire.builder()
                    .nom("AAAA")
                    .prenom("Sanaa")
                    .rib("22222222222222222")
                    .type(BeneficiaireType.PHISIQUE)
                    .build());

            beneficiaireRepository.save(Beneficiaire.builder()
                    .nom("Hassani")
                    .prenom("Jamal")
                    .rib("333333333333333333")
                    .type(BeneficiaireType.MORALE)
                    .build());

           beneficiaireRepository.findAll().forEach(beneficiaire -> {
               System.out.println("=====================");
               System.out.println(beneficiaire.getIdentifiant());
               System.out.println(beneficiaire.getNom());
               System.out.println(beneficiaire.getPrenom());
               System.out.println(beneficiaire.getRib());
               System.out.println(beneficiaire.getType());
           });
        };
    }
}
