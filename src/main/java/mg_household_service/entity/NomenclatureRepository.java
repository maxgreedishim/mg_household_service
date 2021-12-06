package mg_household_service.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="nomenclature",path="nomenclature")
public interface NomenclatureRepository extends JpaRepository<Nomenclature, Integer> {
}