package tez.projects.jwpub.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Location {
    @Id
    private String id;

    private Client client;

    private Date dateInstall;

    private Date dateFin;

    private Date dateExec;

    private float metrage;

    private String lieu;

    private Equipe equipeDes;

    private Equipe equipeInst;

    private String comment ;



}
