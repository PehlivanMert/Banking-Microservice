package dev.pehlivan.bankingsample.utils;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepositInput {

    @NotBlank(message = "Target account no is mandatory")
    private String targetAccountNo;

    @Positive(message = "Transfer amount must be positive")
    private double amount;

}

