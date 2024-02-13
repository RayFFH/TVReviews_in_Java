package dev.phoenix.TVReviews;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tvseriesrepository extends MongoRepository<tvseries, ObjectId> {

    Optional<tvseries> findTVseriesByImdbId(String imdbId);
}