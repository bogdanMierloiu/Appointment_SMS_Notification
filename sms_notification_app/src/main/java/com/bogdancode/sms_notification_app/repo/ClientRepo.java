package com.bogdancode.sms_notification_app.repo;

import com.bogdancode.sms_notification_app.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
