package com.rwandanart.gallery.repository;

import com.rwandanart.gallery.model.Message;
import com.rwandanart.gallery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySenderAndReceiver(User sender, User receiver);
    List<Message> findByReceiverAndIsReadFalse(User receiver);
    List<Message> findBySenderOrReceiverOrderByTimestampAsc(User user1, User user2);
} 