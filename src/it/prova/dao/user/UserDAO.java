package it.prova.dao.user;

import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {
	public List<User> cercaTuttiQuelliCheUsernameIniziaCon(String iniziale) throws Exception;
}
