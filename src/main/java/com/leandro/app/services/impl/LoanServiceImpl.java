package com.leandro.app.services.impl;

import com.leandro.app.model.dao.LoanRepository;
import com.leandro.app.model.entities.Loan;
import com.leandro.app.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Page<Loan> getLoans(int page, int size, Long userId) {
        Pageable paging = PageRequest.of(page, size);
        return Optional.ofNullable(userId).isPresent() ?
                loanRepository.findByUserId(userId, paging) : loanRepository.findAll(paging);
    }
}
