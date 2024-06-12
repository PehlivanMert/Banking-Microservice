package dev.pehlivan.bankingsample.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "transaction", schema = "online_bank")

@SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_sequence", schema = "online_bank", initialValue = 5)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    private long id;
    private long sourceAccountId;
    private long targetAccountId;
    private String targetOwnerName;
    private double amount;
    private LocalDateTime initiationDate;
    private LocalDateTime completionDate;
    private String reference;
    private Double latitude;
    private Double longitude;
}
