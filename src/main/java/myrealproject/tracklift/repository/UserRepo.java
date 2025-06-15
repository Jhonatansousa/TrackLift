package myrealproject.tracklift.repository;

import myrealproject.tracklift.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepo extends CrudRepository<User, UUID> {
}
