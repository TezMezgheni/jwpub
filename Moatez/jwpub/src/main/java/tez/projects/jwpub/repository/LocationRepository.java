package tez.projects.jwpub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tez.projects.jwpub.model.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location,String> {

}
