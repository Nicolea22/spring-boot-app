package com.leandro.app.controller.responses;

import java.util.List;

public class UserWithLoansDTO extends UserDTO {

    private List<LoanDTO> loans;

    public UserWithLoansDTO() {
    }

    public UserWithLoansDTO(Long id, String email, String firstName, String lastName, List<LoanDTO> loans) {
        super(id, email, firstName, lastName);
        this.loans = loans;
    }

    public List<LoanDTO> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanDTO> loans) {
        this.loans = loans;
    }
}
