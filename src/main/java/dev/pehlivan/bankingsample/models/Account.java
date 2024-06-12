package dev.pehlivan.bankingsample.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor

@Entity
@Table(name = "account", schema = "online_bank")
public class Account {

    @Id
    @GeneratedValue
    private long id;
    private String sortCode;
    private String accountNumber;
    private double currentBalance;
    private String bankName;
    private String ownerName;
    private transient List<Transaction> transactions;

    public Account(String bankName, String ownerName, String generateSortCode, String generateAccountNumber, double currentBalance) {
        this.sortCode = generateSortCode;
        this.accountNumber = generateAccountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.ownerName = ownerName;
    }
    public Account(long id, String sortCode, String accountNumber, double currentBalance, String bankName, String ownerName) {
        this.id = id;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.ownerName = ownerName;
    }

    public Account(long id, String sortCode, String accountNumber, double currentBalance, String bankName, String ownerName, List<Transaction> transactions) {
        this.id = id;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.transactions = transactions;
    }
}
