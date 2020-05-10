package teb.edukacja.forum.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import teb.edukacja.forum.model.Message;
import teb.edukacja.forum.repository.MessageRepository;

import java.util.Date;

@Component
public class BoostrapData implements CommandLineRunner {
    MessageRepository messageRepository;

    public BoostrapData(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App has started!");
        messageRepository.save(new Message(1L, new Date().toString(), "admin", "Witaj na forum!"));
        messageRepository.save(new Message(2L, new Date().toString(), "user@teb.pl", "Czy ktoś jest na tym forum?"));
        System.out.println("Messages added: " + messageRepository.count());
    }
}
