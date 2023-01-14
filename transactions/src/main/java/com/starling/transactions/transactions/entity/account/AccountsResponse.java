package com.starling.transactions.transactions.entity.account;

import com.starling.transactions.transactions.entity.Accounts;

import java.util.List;

public class AccountsResponse {

    private List<Accounts> accounts;

    public AccountsResponse(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
