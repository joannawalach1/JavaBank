package com.banking.accountservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "accounts")
public class Account {
    @Id
    private Long id;
    private String accountNumber;
    private String userId;
    private String accountType;
    private BigDecimal balance;
    private String currency;
    private String status = "Active";
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
