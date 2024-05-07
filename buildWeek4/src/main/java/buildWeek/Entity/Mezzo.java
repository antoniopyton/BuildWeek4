package buildWeek.Entity;

import buildWeek.Enum.Servizio;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "mezzi")
public class Mezzo {

    @Enumerated(EnumType.STRING)
    private Servizio servizio;

    private Integer capienza;

    private double durataServizio;

    private Integer numeroBiglietti;

    private Integer numeroPercorrenzeTratta;

    private double tempoEffettivoPercorrenza;

    public Mezzo(Servizio servizio, Integer capienza, double durataServizio, Integer numeroBiglietti, Integer numeroPercorrenzeTratta, double tempoEffettivoPercorrenza) {
        this.servizio = servizio;
        this.capienza = capienza;
        this.durataServizio = durataServizio;
        this.numeroBiglietti = numeroBiglietti;
        this.numeroPercorrenzeTratta = numeroPercorrenzeTratta;
        this.tempoEffettivoPercorrenza = tempoEffettivoPercorrenza;
    }

    public Mezzo() {

    }

    public Servizio getServizio() {
        return servizio;
    }

    public void setServizio(Servizio servizio) {
        this.servizio = servizio;
    }

    public Integer getCapienza() {
        return capienza;
    }

    public void setCapienza(Integer capienza) {
        this.capienza = capienza;
    }

    public double getDurataServizio() {
        return durataServizio;
    }

    public void setDurataServizio(double durataServizio) {
        this.durataServizio = durataServizio;
    }

    public Integer getNumeroBiglietti() {
        return numeroBiglietti;
    }

    public void setNumeroBiglietti(Integer numeroBiglietti) {
        this.numeroBiglietti = numeroBiglietti;
    }

    public Integer getNumeroPercorrenzeTratta() {
        return numeroPercorrenzeTratta;
    }

    public void setNumeroPercorrenzeTratta(Integer numeroPercorrenzeTratta) {
        this.numeroPercorrenzeTratta = numeroPercorrenzeTratta;
    }

    public double getTempoEffettivoPercorrenza() {
        return tempoEffettivoPercorrenza;
    }

    public void setTempoEffettivoPercorrenza(double tempoEffettivoPercorrenza) {
        this.tempoEffettivoPercorrenza = tempoEffettivoPercorrenza;
    }


}
