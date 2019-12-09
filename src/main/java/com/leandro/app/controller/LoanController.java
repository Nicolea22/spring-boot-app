package com.leandro.app.controller;

import com.leandro.app.controller.converters.LoanConverter;
import com.leandro.app.controller.responses.LoanDTO;
import com.leandro.app.controller.responses.pagination.PageDTO;
import com.leandro.app.model.entities.Loan;
import com.leandro.app.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/loans")
@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private LoanConverter loanConverter;

    @GetMapping
    @ResponseBody
    public PageDTO<LoanDTO> get(@RequestParam(value="page") int page, @RequestParam(value="size") int size,
                                @RequestParam(value="user_id", required = false) Long userId) {
        Page<Loan> loans = loanService.getLoans(page, size, userId);
        return loanConverter.convertToPageDTO(loans);
    }


}
