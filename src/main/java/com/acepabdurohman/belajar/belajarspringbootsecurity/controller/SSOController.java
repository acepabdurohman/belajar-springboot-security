package com.acepabdurohman.belajar.belajarspringbootsecurity.controller;

import com.acepabdurohman.belajar.belajarspringbootsecurity.model.HeaderSSO;
import com.acepabdurohman.belajar.belajarspringbootsecurity.model.LoginSSO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SSOController {

    @Autowired
    private LoginSSO loginSSO;

    @GetMapping("/sso")
    public String getSso(){
        String username = "840137";
        String password = "mpresensi";
        String usrId = "909057";
        String endpoint = "https://myworkbook.telkom.co.id/mwb/geni/index.php?r=login&uname=" + username +
                "&upass=" + password + "&app=PRS";
        HeaderSSO headerSSO = loginSSO.login(usrId);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("x-signature", headerSSO.getSignature());
        headers.add("x-timestamp", String.valueOf(headerSSO.getTimestamp()));
        headers.add("x-usr-id", headerSSO.getUsrId());
        System.out.println("Signature : " + headerSSO.getSignature());
        System.out.println("Timestamp : " + String.valueOf(headerSSO.getTimestamp()));
        System.out.println("Usr id : " + headerSSO.getUsrId());
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
        String json = responseEntity.getBody();
        return json;
    }
}
