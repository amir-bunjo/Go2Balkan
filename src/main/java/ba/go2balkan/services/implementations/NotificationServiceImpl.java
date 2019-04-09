package ba.go2balkan.services.implementations;

import ba.go2balkan.model.messages.Notification;
import ba.go2balkan.repository.NotificationRepository;
import ba.go2balkan.services.interfaces.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification saveOrUpdate(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public boolean delete(Notification notification) {
        try {
            notificationRepository.delete(notification);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }
}
