package com.acepabdurohman.belajar.belajarspringbootsecurity.model;

import lombok.Data;

@Data
public class HeaderSSO {
    private String usrId;
    private long timestamp;
    private String signature;
}
