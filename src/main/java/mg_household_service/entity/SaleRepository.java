package mg_household_service.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="sales",path="sales")
public interface SaleRepository extends JpaRepository<Sale, Integer> {
}