package tn.esprit.pidevbackend.entities.AccountEntities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idAccount;
    Date creationDate;
    float interestRate;
    long balance;

    @Enumerated(EnumType.STRING)
    AccountType accountType;
    @Enumerated(EnumType.STRING)
    AccountStatus accountStatus;

    @OneToOne
    Card card;
    @OneToMany(mappedBy = "account")
    Set<Transaction> transactions;
   /* @ManyToOne
    User user;
    @OneToMany(mappedBy = "account")
    Set<Credit> credits;*/

}