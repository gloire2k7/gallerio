package com.rwandanart.gallery.service;

import com.rwandanart.gallery.model.Message;
import com.rwandanart.gallery.model.User;

import java.util.List;
import java.util.Optional;

public interface MessageService {
    Message sendMessage(Message message);
    Message updateMessage(Long id, Message message);
    void deleteMessage(Long id);
    Optional<Message> getMessageById(Long id);
    List<Message> getMessagesBetweenUsers(User user1, User user2);
    List<Message> getUnreadMessages(User user);
    void markMessageAsRead(Long id);
    void markAllMessagesAsRead(User user);
    long getUnreadMessageCount(User user);
} 