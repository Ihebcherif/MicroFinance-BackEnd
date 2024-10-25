package tn.esprit.pidevbackend.entities.CreditEntities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.pidevbackend.entities.AccountEntities.AccountStatus;
import tn.esprit.pidevbackend.entities.AccountEntities.AccountType;
import tn.esprit.pidevbackend.entities.AccountEntities.Card;
import tn.esprit.pidevbackend.entities.AccountEntities.Transaction;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idCredit;
    Date deadline;
    float interestRate;
    Date startDate;
    float autoFinance;

    @OneToOne
    CreditRequest creditRequest;
    @OneToMany(mappedBy = "credit")
    Set<Recovery> recoveries;
}
