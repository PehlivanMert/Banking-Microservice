package dev.pehlivan.bankingsample.repositories;

import dev.pehlivan.bankingsample.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findBySourceAccountIdOrderByInitiationDate(long id);
}
