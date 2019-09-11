package com.chatiya.repositories;

import com.chatiya.entities.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import java.util.List;

public class UserRepository {

    private MongoTemplate mongoTemplate;

    public UserRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public User findById(String id) {
        return mongoTemplate.findById(new ObjectId(id), User.class);
    }

    public List<User> getAll() {
        return mongoTemplate.findAll(User.class);
    }

    public User save(User user) {
        mongoTemplate.save(user);
        return user;
    }


}
