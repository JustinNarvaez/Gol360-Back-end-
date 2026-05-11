package model.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "visit_fan")
@DiscriminatorValue("VISIT_FAN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class VisitFan extends User {

    @Column(nullable = false)
    private Boolean notificationsEnabled;

    @ManyToMany
    @JoinTable(
            name = "visit_fan_cities",
            joinColumns = @JoinColumn(name = "visit_fan_id"),
            inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    private List<City> favCities;
}
