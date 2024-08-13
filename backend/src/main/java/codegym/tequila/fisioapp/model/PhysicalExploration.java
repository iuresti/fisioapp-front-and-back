package codegym.tequila.fisioapp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Embeddable
public class PhysicalExploration {

    private Double weight;

    private Double height;
    @Column(name = "weekly_cardio_frequency")
    private Integer weeklyCardioFrequency;
    @Column(name = "blood_type")
    private String bloodType;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getWeeklyCardioFrequency() {
        return weeklyCardioFrequency;
    }

    public void setWeeklyCardioFrequency(Integer weeklyCardiofrequency) {
        this.weeklyCardioFrequency = weeklyCardiofrequency;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalExploration that = (PhysicalExploration) o;
        return Objects.equals(weight, that.weight) && Objects.equals(height, that.height) && Objects.equals(weeklyCardioFrequency, that.weeklyCardioFrequency) && Objects.equals(bloodType, that.bloodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height, weeklyCardioFrequency, bloodType);
    }
}
