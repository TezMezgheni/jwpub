package tez.projects.jwpub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tez.projects.jwpub.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
