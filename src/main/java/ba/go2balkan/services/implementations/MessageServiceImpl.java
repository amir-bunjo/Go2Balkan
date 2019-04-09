package ba.go2balkan.services.implementations;

import ba.go2balkan.model.messages.Message;
import ba.go2balkan.repository.MessageRepository;
import ba.go2balkan.services.interfaces.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message saveOrUpdate(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public boolean delete(Message message) {
        try {
            messageRepository.delete(message);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}
