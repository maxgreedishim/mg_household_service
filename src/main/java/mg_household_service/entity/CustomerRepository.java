package mg_household_service.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="customers",path="customers")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}