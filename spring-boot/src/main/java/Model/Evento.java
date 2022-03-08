package Model;

import java.util.Objects;

public class Evento {
	
	private String nome;
	private int inizio_ora;
	private int inizio_minuti;
	private int fine_ora;
	private int fine_minuti;
	private int data_giorno;
	private int data_mese;
	private int data_anno;
	private boolean online;
	private String stato;
	private int posti_rimanenti;
	private int capacita;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getInizio_ora() {
		return inizio_ora;
	}
	public void setInizio_ora(int inizio_ora) {
		this.inizio_ora = inizio_ora;
	}
	public int getInizio_minuti() {
		return inizio_minuti;
	}
	public void setInizio_minuti(int inizio_minuti) {
		this.inizio_minuti = inizio_minuti;
	}
	public int getFine_ora() {
		return fine_ora;
	}
	public void setFine_ora(int fine_ora) {
		this.fine_ora = fine_ora;
	}
	public int getFine_minuti() {
		return fine_minuti;
	}
	public void setFine_minuti(int fine_minuti) {
		this.fine_minuti = fine_minuti;
	}
	public int getData_giorno() {
		return data_giorno;
	}
	public void setData_giorno(int data_giorno) {
		this.data_giorno = data_giorno;
	}
	public int getData_mese() {
		return data_mese;
	}
	public void setData_mese(int data_mese) {
		this.data_mese = data_mese;
	}
	public int getData_anno() {
		return data_anno;
	}
	public void setData_anno(int data_anno) {
		this.data_anno = data_anno;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
}
	
	
	
	
}

	