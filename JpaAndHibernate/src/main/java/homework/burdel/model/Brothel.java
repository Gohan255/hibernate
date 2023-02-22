package homework.burdel.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@ToString
public class Brothel implements Serializable {

    private static final long serialVersionUID = 8272334127334534374L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String momNick;
    @OneToMany(mappedBy = "brothel")
    @ToString.Exclude
    private List<Whore> whores = new ArrayList<>();

    public Brothel(String name, String momNick) {
        this.name = name;
        this.momNick = momNick;
    }

    public void addWhore(Whore whore) {
        whores.add(whore);
        whore.setBrothel(this);
    }


}
