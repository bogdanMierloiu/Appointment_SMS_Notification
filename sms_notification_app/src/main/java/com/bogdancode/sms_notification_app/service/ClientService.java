package com.bogdancode.sms_notification_app.service;

import com.bogdancode.sms_notification_app.model.Client;
import com.bogdancode.sms_notification_app.repo.ClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepo clientRepo;


    @Transactional
    public Client add(Client client) {
        Client clientToSave = new Client();
        clientToSave.setName(client.getName());
        clientToSave.setPhoneNumber(client.getPhoneNumber());
        return clientRepo.save(client);
    }

    public List<Client> getAll() {
        return clientRepo.findAll();
    }
}
