package com.leandro.app.controller.responses;

import java.util.List;

public class UserWithLoansListWrapper {

    private List<UserWithLoansDTO> userWithLoans;

    public List<UserWithLoansDTO> getUserWithLoans() {
        return userWithLoans;
    }

    public void setUserWithLoans(List<UserWithLoansDTO> userWithLoans) {
        this.userWithLoans = userWithLoans;
    }

}
