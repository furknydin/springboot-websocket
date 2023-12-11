package com.furkanaydin.websocket.repository;

import com.furkanaydin.websocket.domain.user.Status;
import com.furkanaydin.websocket.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
