package myrealproject.tracklift.service.user;

import myrealproject.tracklift.dto.request.RegisterUserRequestDTO;
import myrealproject.tracklift.dto.response.AuthResponseDTO;
import myrealproject.tracklift.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserSevice{

    @Autowired
    UserRepo repo;

    @Override
    public AuthResponseDTO createUser(RegisterUserRequestDTO request) {
        //IMPLEMENTAR LÓGICA AQUI E CRIPTOGRAFIA
        return null;
    }
}
