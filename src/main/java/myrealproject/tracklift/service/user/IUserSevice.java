package myrealproject.tracklift.service.user;

import myrealproject.tracklift.dto.request.RegisterUserRequestDTO;
import myrealproject.tracklift.dto.response.AuthResponseDTO;

public interface IUserSevice {

    AuthResponseDTO createUser(RegisterUserRequestDTO request);
}
