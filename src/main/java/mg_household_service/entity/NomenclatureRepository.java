package mg_household_service.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="mg_household_service",path="mg_household_service")
public interface NomenclatureRepository extends JpaRepository<Nomenclature, Integer> {
}