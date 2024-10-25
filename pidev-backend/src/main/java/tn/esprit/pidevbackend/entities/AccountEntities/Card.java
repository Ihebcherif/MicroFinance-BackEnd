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
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idCard;
    long numCard;
    Date expDate;
    long cvv;
    long codeDab;

    @Enumerated(EnumType.STRING)
    CardType cardType;

    @OneToOne(mappedBy = "card")
    Account account;
}
