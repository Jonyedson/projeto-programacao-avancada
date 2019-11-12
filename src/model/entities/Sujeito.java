package model.entities;

public interface Sujeito {
	
	void addObservador(Observador obs);
	void removeObservador(Observador obs);
	void notificarObsevador();
	
}
