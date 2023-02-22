package homework.burdel.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Whore implements Serializable {

    private static final long serialVersionUID = 2374534767398121374L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String preferences;
    private int age;
    private boolean hiv;

    @ManyToOne
    @ToString.Exclude
    private Brothel brothel;

    public Whore(String name, String surname, String preferences, int age, boolean hiv) {
        this.name = name;
        this.surname = surname;
        this.preferences = preferences;
        this.age = age;
        this.hiv = hiv;
    }

}
