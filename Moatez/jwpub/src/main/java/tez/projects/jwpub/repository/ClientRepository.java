package tez.projects.jwpub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tez.projects.jwpub.model.Client;

public interface ClientRepository extends MongoRepository <Client, String> {
}
