package tn.esprit.pidevbackend.entities.AccountEntities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idTransaction;
    long amount;
    Date transactionDate;
    long numAccSender;
    long numAccReciever;

    @Enumerated(EnumType.STRING)
    TransactionType transactionType;

    @ManyToOne
    Account account;

}
