package com.leandro.app.controller.converters;

import com.leandro.app.controller.responses.LoanDTO;
import com.leandro.app.controller.responses.pagination.PageDTO;
import com.leandro.app.model.entities.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoanConverter {

    @Autowired
    private PageConverter pageConverter;

    public PageDTO<LoanDTO> convertToPageDTO(Page<Loan> source) {
        PageDTO<LoanDTO> pageDTO = new PageDTO<>(convertToLoanDTOs(source.getContent()), pageConverter.convertToPagingDTO(source));
        return pageDTO;
    }

    public List<LoanDTO> convertToLoanDTOs(List<Loan> source) {
        List<LoanDTO> loans = new ArrayList<>();
        source.forEach(loan -> loans.add(convertToLoanDTO(loan)));
        return loans;
    }

    public LoanDTO convertToLoanDTO(Loan source) {
        return new LoanDTO(source.getId(), source.getTotal(), source.getUserId());
    }

    public List<Loan> convertToLoans(List<LoanDTO> source) {
        List<Loan> loans = new ArrayList<>();
        source.forEach(loan -> loans.add(convertToLoan(loan)));
        return loans;
    }

    public Loan convertToLoan(LoanDTO source) {
        return new Loan(source.getTotal(), source.getUserId());
    }

}
