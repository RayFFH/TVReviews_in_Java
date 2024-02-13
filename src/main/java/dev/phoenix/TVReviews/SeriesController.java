package dev.phoenix.TVReviews;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tvseries")
// @CrossOrigin(origins = "https://rayffh.github.io/React_For_TVreviews/")
@CrossOrigin(origins = "*")
public class SeriesController {

    @Autowired
    private tvseriesservice tvseriesservice;

    @GetMapping
    public ResponseEntity<List<tvseries>> getalltvseries() {
        return new ResponseEntity<List<tvseries>>(tvseriesservice.alltvseries(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<tvseries>> getsingletvseries(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<tvseries>>(tvseriesservice.singletvseries(imdbId), HttpStatus.OK);

    }

}