package buildWeek.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "biglietti_e_abbonamenti")
public class BigliettoEAbbonamento {

    private Integer id;

    private String codiceUnivoco;


    private LocalDate dataEmissione;

    public BigliettoEAbbonamento(Integer id, String codiceUnivoco, LocalDate dataEmissione) {
        this.id = id;
        this.codiceUnivoco = codiceUnivoco;
        this.dataEmissione = dataEmissione;
    }

    public BigliettoEAbbonamento() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(String codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public LocalDate getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(LocalDate dataEmissione) {
        this.dataEmissione = dataEmissione;
    }
}
