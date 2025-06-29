package com.bagdachi.ecom.user_service.service;

import com.bagdachi.ecom.user_service.dto.AuthResponse;
import com.bagdachi.ecom.user_service.dto.LoginRequest;
import com.bagdachi.ecom.user_service.dto.RegisterRequest;

public interface AuthService {
    void register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
