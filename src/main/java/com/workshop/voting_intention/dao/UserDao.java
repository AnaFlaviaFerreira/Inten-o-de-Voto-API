package com.workshop.voting_intention.dao;

import com.workshop.voting_intention.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    User salvarUsuario(User usuario);

    List<User> buscarVotos();

    List<User> obterPorVoto(Long voto);
}
