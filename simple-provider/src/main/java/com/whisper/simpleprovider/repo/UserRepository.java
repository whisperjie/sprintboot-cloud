package com.whisper.simpleprovider.repo;

import com.whisper.simpleprovider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
