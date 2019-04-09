package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.messages.Message;

public interface MessageService {
    Message saveOrUpdate(Message message);
    boolean delete(Message message);
    List<Message> findAll();
}
