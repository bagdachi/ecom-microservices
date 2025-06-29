package com.bagdachi.ecom.user_service.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "audit_logs")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action; // e.g., LOGIN_SUCCESS, PASSWORD_CHANGED

    private String performedBy;

    private String details;

    private LocalDateTime timestamp = LocalDateTime.now();
}
