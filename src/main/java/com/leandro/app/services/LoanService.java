package com.leandro.app.services;

import com.leandro.app.model.entities.Loan;
import org.springframework.data.domain.Page;


public interface LoanService {

    Page<Loan> getLoans(int page, int size, Long userId);
}
