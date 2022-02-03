package tez.projects.jwpub.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Employee {
    // should get employee information
    @Id
    private String id ;

    @NonNull
    private String name ;

}
