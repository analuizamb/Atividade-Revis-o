package atividade1;

import java.util.Date;

public class NotaFiscal {
	private int numero;
	private Date data;
	private int chave;
	private int cnpjEmissor;
	private String nomeEmissor;
	private int docCliente;
	private String nomeCliente;
	private String listaProdNota;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public int getCnpjEmissor() {
		return cnpjEmissor;
	}
	public void setCnpjEmissor(int cnpjEmissor) {
		this.cnpjEmissor = cnpjEmissor;
	}
	public String getNomeEmissor() {
		return nomeEmissor;
	}
	public void setNomeEmissor(String nomeEmissor) {
		this.nomeEmissor = nomeEmissor;
	}
	public int getDocCliente() {
		return docCliente;
	}
	public void setDocCliente(int docCliente) {
		this.docCliente = docCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getListaProdNota() {
		return listaProdNota;
	}
	public void setListaProdNota(String listaProdNota) {
		this.listaProdNota = listaProdNota;
	}
	
	public NotaFiscal(int numero, Date data, int chave, int cnpjEmissor, String nomeEmissor, int docCliente, String nomeCliente, String listaProdNota) {
		this.numero = numero;
		this.data = data;
		this.chave = chave;
		this.cnpjEmissor = cnpjEmissor;
		this.nomeEmissor = nomeEmissor;
		this.docCliente = docCliente;
		this.nomeCliente =  nomeCliente;
		this.listaProdNota = listaProdNota;
		
	}


}
