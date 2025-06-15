package myrealproject.tracklift.controller;

import myrealproject.tracklift.dto.request.RegisterUserRequestDTO;
import myrealproject.tracklift.dto.response.AuthResponseDTO;
import myrealproject.tracklift.dto.response.ErrorMessageDTO;
import myrealproject.tracklift.exception.UserAlreadyExistsException;
import myrealproject.tracklift.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    UserServiceImpl service;

    @PostMapping("/register")
    public ResponseEntity<Object> createUser (@RequestBody RegisterUserRequestDTO userDTO) {
        try {
            AuthResponseDTO res = service.createUser(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(res);
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(409).body(new ErrorMessageDTO(e.getMessage()));
        }
    }
}
