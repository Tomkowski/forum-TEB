package teb.edukacja.forum.service;

import teb.edukacja.forum.model.Message;

import java.util.List;

public interface MessageApiSevice {

    List<Message> fetchAll();

    Message findById(Long id);

    boolean addMessage(Message message);

    boolean editMessage(Message message);

    boolean deleteMessageById(Long id);
}
