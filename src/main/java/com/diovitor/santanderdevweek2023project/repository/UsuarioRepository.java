package com.diovitor.santanderdevweek2023project.repository;

import com.diovitor.santanderdevweek2023project.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
