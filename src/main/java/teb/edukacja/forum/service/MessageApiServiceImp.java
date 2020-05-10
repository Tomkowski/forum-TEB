package teb.edukacja.forum.service;


import org.springframework.stereotype.Service;
import teb.edukacja.forum.model.Message;
import teb.edukacja.forum.repository.MessageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MessageApiServiceImp implements MessageApiSevice{

    MessageRepository messageRepository;

    public MessageApiServiceImp(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> fetchAll() {
        return (List<Message>) messageRepository.findAll();
    }

    @Override
    public Message findById(Long id) {
        Optional<Message> optionalMessage = messageRepository.findById(id);
        return optionalMessage.orElse(null);
    }

    @Override
    public boolean addMessage(Message message) {
        messageRepository.save(message);
        return true;
    }

    @Override
    public boolean editMessage(Message message) {
        messageRepository.save(message);
        return true;
    }

    @Override
    public boolean deleteMessageById(Long id) {
        messageRepository.deleteById(id);
        return true;
    }
}
