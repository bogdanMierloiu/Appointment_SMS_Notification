package com.bogdancode.sms_notification_app.controller;

import com.bogdancode.sms_notification_app.model.Client;
import com.bogdancode.sms_notification_app.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;


    @GetMapping
    public String index(Model model) {
        model.addAttribute("clients", clientService.getAll());
        return "index";
    }

    @GetMapping("/add-client-form")
    public String goToAddForm(Model model) {
        model.addAttribute("client", new Client());
        return "add-form";
    }

    @PostMapping("/add-client")
    public String index(@ModelAttribute Client client, Model model) {
        clientService.add(client);
        model.addAttribute("clients", clientService.getAll());
        return "index";
    }

}
