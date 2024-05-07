package buildWeek.Entity;

import buildWeek.Enum.DurataAbbonamento;
import buildWeek.Enum.Stato;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "abbonamenti")
public class Abbonamento extends BigliettoEAbbonamento {

    @Id
    @GeneratedValue
    @OneToOne
    @JoinColumn(name = "utente_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    @Enumerated(EnumType.STRING)
    private DurataAbbonamento durataAbbonamento;

    public Abbonamento(Integer id, String codiceUnivoco, LocalDate dataEmissione, Stato stato, DurataAbbonamento durataAbbonamento) {
        super(id, codiceUnivoco, dataEmissione);
        this.id = id;
        this.stato = stato;
        this.durataAbbonamento = durataAbbonamento;
    }

    public Abbonamento() {
        super();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public DurataAbbonamento getDurata() {
        return durataAbbonamento;
    }

    public void setDurata(DurataAbbonamento durataAbbonamento) {
        this.durataAbbonamento = durataAbbonamento;
    }
}
