package tez.projects.jwpub.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Equipe {
    @Id
    private String id;

    private int taille;

    private List<Employee> equipe;

}
