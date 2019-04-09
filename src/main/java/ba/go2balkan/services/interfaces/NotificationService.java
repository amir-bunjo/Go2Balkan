package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.messages.Notification;

public interface NotificationService {
    Notification saveOrUpdate(Notification notification);
    boolean delete(Notification notification);
    List<Notification> findAll();
}
