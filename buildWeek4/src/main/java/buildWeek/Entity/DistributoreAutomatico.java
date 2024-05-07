package buildWeek.Entity;

import buildWeek.Enum.StatoDistributori;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "distributori_automatici")
public class DistributoreAutomatico extends Distributore {

    @Enumerated(EnumType.STRING)
    private StatoDistributori stato;


    public DistributoreAutomatico(Integer bigliettiEmessi) {
        super(bigliettiEmessi);
    }

    public DistributoreAutomatico(Integer bigliettiEmessi, StatoDistributori stato) {
        super(bigliettiEmessi);
        this.stato = stato;
    }

    public StatoDistributori getStato() {
        return stato;
    }

    public void setStato(StatoDistributori stato) {
        this.stato = stato;
    }
}
