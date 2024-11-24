package net.naji.virementservice.repository;

import net.naji.virementservice.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface VirementRepository extends JpaRepository<Virement,Long> {

}
