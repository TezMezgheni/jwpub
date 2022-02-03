package tez.projects.jwpub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tez.projects.jwpub.model.Equipe;

@Repository
public interface EquipeRepository extends MongoRepository<Equipe,String> {
}
