package buildWeek.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rivenditori")
public class Rivenditore extends Distributore {
    public Rivenditore(Integer bigliettiEmessi) {
        super(bigliettiEmessi);
    }

    public Rivenditore() {

    }


}
