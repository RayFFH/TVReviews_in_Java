package dev.phoenix.TVReviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tvseries")
public class SeriesController {

    @Autowired
    private tvseriesservice tvseriesservice;

    @GetMapping
    public ResponseEntity<List<tvseries>> getalltvseries() {
        return new ResponseEntity<List<tvseries>>(tvseriesservice.alltvseries(), HttpStatus.OK);
    }

}