package dev.glassym.dongnecommunity.repository;

import dev.glassym.dongnecommunity.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
