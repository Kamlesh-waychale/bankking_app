package com.bankking.bankking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

    private long id;
    private String acHolderNamme;
    private double balance;
}
