package hotelux.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Accounts")
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Accounts implements Serializable {

    @Id
    String username;
    String email;
    String password;
    String fullname;
    boolean isactived;
    String qrcode;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    Date createdate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    Date updatedate;
    String phone;
    @OneToOne
    @JoinColumn(name = "username")
    private Hotel hotel;
}