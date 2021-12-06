package mg_household_service.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="executors",path="executors")
public interface ExecutorRepository extends JpaRepository<Executor, Integer> {
}