package com.bagdachi.ecom.user_service.service;

import com.bagdachi.ecom.user_service.domain.entity.User;

import java.util.Date;

public interface JwtService {
    String generateAccessToken(User user);
    String generateRefreshToken(User user);
    boolean isTokenValid(String token, User user);
    String extractUsername(String token);
    Date extractExpiration(String token);
}
