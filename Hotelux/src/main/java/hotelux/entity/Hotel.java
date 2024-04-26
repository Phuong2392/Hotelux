package hotelux.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hotel")
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address;
    String image;
    int start;

    @ManyToOne
    @JoinColumn(name = "city")
    Location location;

    @OneToOne(mappedBy = "hotel", cascade = CascadeType.ALL)
    private Accounts accounts;
}
