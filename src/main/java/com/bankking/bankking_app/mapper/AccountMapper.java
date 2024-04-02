package com.bankking.bankking_app.mapper;

import com.bankking.bankking_app.dto.AccountDto;
import com.bankking.bankking_app.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto)
    {
        Account account = new Account(
            accountDto.getId(),
            accountDto.getAcHolderNamme(),
            accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account)
    {
        AccountDto accountDto = new AccountDto(
            account.getId(),
            account.getAcHolderName(),
            account.getBalance()
        );
        return accountDto;
    }

}
