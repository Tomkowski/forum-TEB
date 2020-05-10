package teb.edukacja.forum.controller;

import org.springframework.web.bind.annotation.*;
import teb.edukacja.forum.model.Message;
import teb.edukacja.forum.service.MessageApiServiceImp;
import teb.edukacja.forum.service.MessageApiSevice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/teb/forum")
public class MessageController {

    private final MessageApiServiceImp apiService;

    public MessageController(MessageApiServiceImp apiService) {
        this.apiService = apiService;
    }

    @RequestMapping("/all")
    public List<Message> fetchAll() {
        return apiService.fetchAll();
    }

    @PostMapping
    public boolean addMessage(@RequestBody Message message) {
        return apiService.addMessage(message);
    }

    @PutMapping
    public boolean editMessage(@RequestBody Message message) {
        return apiService.editMessage(message);
    }

    /*@RequestMapping
    public List<Message> findByUsername(@RequestParam String username){
        return messages.stream()
                .filter(message -> message.getUsername().equals(username))
                .collect(Collectors.toList());
    }*/

    @DeleteMapping
    public boolean removeMessage(@RequestParam Long id) {
        return apiService.deleteMessageById(id);
    }


}

// localhost:8080/teb/forum+
