package buildWeek.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "biglietti")
public class Biglietto extends BigliettoEAbbonamento {

    @Id
    private Integer id;

    private boolean timbrato;

    private LocalTime inizio;

    private LocalTime scadenza;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    public Biglietto(Integer id, String codiceUnivoco, LocalDate dataEmissione, boolean timbrato, LocalTime inizio, LocalTime scadenza) {
        super(id, codiceUnivoco, dataEmissione);
        this.timbrato = timbrato;
        this.inizio = inizio;
        this.scadenza = scadenza;
    }

    public Biglietto() {

    }

    public boolean isTimbrato() {
        return timbrato;
    }

    public void setTimbrato(boolean timbrato) {
        this.timbrato = timbrato;
    }

    public LocalTime getInizio() {
        return inizio;
    }

    public void setInizio(LocalTime inizio) {
        this.inizio = inizio;
    }

    public LocalTime getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalTime scadenza) {
        this.scadenza = scadenza;
    }
}
