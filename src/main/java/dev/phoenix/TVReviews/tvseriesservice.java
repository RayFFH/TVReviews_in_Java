package dev.phoenix.TVReviews;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class tvseriesservice {

    @Autowired
    private tvseriesrepository tvseriesrepository;

    public List<tvseries> alltvseries() {
        return tvseriesrepository.findAll();
    }

    public Optional<tvseries> singletvseries(String imdbId) {
        return tvseriesrepository.findTVseriesByImdbId(imdbId);
    }

}