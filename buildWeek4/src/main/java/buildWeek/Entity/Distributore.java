package buildWeek.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "distributori")
public class Distributore {

    private Integer bigliettiEmessi;

    public Distributore(Integer bigliettiEmessi) {
        this.bigliettiEmessi = bigliettiEmessi;
    }

    public Distributore() {

    }

    public Integer getBigliettiEmessi() {
        return bigliettiEmessi;
    }

    public void setBigliettiEmessi(Integer bigliettiEmessi) {
        this.bigliettiEmessi = bigliettiEmessi;
    }
}
