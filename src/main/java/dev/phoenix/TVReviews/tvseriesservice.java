package dev.phoenix.TVReviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class tvseriesservice {

    @Autowired
    private tvseriesrepository tvseriesrepository;

    public List<tvseries> alltvseries() {
        return tvseriesrepository.findAll();
    }
}