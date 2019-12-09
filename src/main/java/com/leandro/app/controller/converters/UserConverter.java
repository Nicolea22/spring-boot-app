package com.leandro.app.controller.converters;


import com.leandro.app.controller.responses.UserDTO;
import com.leandro.app.controller.responses.UserWithLoansDTO;
import com.leandro.app.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConverter {

    @Autowired
    private LoanConverter loanConverter;

    public UserWithLoansDTO convertToUserDTO(User source) {
        return new UserWithLoansDTO(source.getId(), source.getEmail(), source.getFirstName(),
                source.getLastName(), loanConverter.convertToLoanDTOs(source.getLoans()));
    }

    public User convertToUser(UserDTO userDTO) {
        return new User(userDTO.getEmail(), userDTO.getFirstName(),
                userDTO.getLastName(), new ArrayList<>());
    }

    public List<User> convertToUserWithLoans(List<UserWithLoansDTO> usersWithLoansDTO) {
        List<User> userEntityList = new ArrayList<>();
        usersWithLoansDTO.forEach( userWithLoansDTO -> {
            User user = new User (userWithLoansDTO.getEmail(), userWithLoansDTO.getFirstName(),
                    userWithLoansDTO.getLastName(), loanConverter.convertToLoans(userWithLoansDTO.getLoans()));
            userEntityList.add(user);

        });
        return userEntityList;
    }

}
