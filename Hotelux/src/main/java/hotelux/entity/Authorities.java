package hotelux.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "authorities", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username", "roles"})
})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Authorities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @ManyToOne
    @JoinColumn(name = "id")
    Accounts accounts;

    @ManyToOne
    @JoinColumn(name = "roles")
    Roles roles;
}
