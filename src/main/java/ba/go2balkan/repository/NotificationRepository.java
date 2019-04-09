package ba.go2balkan.repository;

import ba.go2balkan.model.messages.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
