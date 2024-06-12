package dev.pehlivan.bankingsample.utils;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountInput {

    @NotBlank(message = "Bank name is mandatory")
    private String bankName;

    @NotBlank(message = "Owner name is mandatory")
    private String ownerName;

}

