package com.pjg360.PJG360.repositories;

import com.pjg360.PJG360.model.entities.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepository extends JpaRepository<Preference, Integer> {
}
