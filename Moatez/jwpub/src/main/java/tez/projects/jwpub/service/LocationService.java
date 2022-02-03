package tez.projects.jwpub.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tez.projects.jwpub.repository.LocationRepository;

@Data
@Service
public class LocationService {

    @Autowired
    private final LocationRepository locationRepository;




}
