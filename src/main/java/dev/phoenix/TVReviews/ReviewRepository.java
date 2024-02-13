package dev.phoenix.TVReviews;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
