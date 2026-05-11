package com.pjg360.PJG360.model.entities;


import com.pjg360.PJG360.enums.NotificationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "preferences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToMany
    @JoinTable(
            name = "preferences_teams",
            joinColumns = @JoinColumn(name = "preferences_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<Team> favNations;

    @ManyToMany
    @JoinTable(
            name = "preferences_stadiums",
            joinColumns = @JoinColumn(name = "preferences_id"),
            inverseJoinColumns = @JoinColumn(name = "stadium_id")
    )
    private List<Stadium> favStadiums;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "preferences_notifications",
            joinColumns = @JoinColumn(name = "preferences_id"))
    @Column(name = "notification_type")
    private List<NotificationType> favNotifications;
}
