package codegym.tequila.fisioapp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Embeddable
public class FamiliarRecords {

    @Column(name = "hereditary_diseases")
    private String hereditaryDiseases;
    @Column(name = "genetical_predispositions")
    private String geneticalPredispositions;

    public String getHereditaryDiseases() {
        return hereditaryDiseases;
    }

    public void setHereditaryDiseases(String hereditaryDiseases) {
        this.hereditaryDiseases = hereditaryDiseases;
    }

    public String getGeneticalPredispositions() {
        return geneticalPredispositions;
    }

    public void setGeneticalPredispositions(String geneticalPredispositions) {
        this.geneticalPredispositions = geneticalPredispositions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamiliarRecords that = (FamiliarRecords) o;
        return Objects.equals(hereditaryDiseases, that.hereditaryDiseases) && Objects.equals(geneticalPredispositions, that.geneticalPredispositions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hereditaryDiseases, geneticalPredispositions);
    }
}
