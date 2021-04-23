package atividade1;

import java.util.Date;

public class Pedido extends NotaFiscal {
	public Pedido(int numero, Date data, int chave, int cnpjEmissor, String nomeEmissor, int docCliente, String nomeCliente, String listaProdNota) {
		super(numero, data, chave, cnpjEmissor, nomeEmissor, docCliente, nomeCliente, listaProdNota);
	}

	private int identificacao;
	private String nome;
	private String descricao;
	private int quantidade;
	private int valor;
	
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	//MINHA DUVIDA:
	//Aqui eu presiso reescrever todos os atributos da classe NotaFiscal que foram trazidos pelo "extends" de novo ou somente os atributos exclusivos da classe Pedido?
	//Está dando o erro: "Implicit super constructor NotaFiscal() is undefined. Must explicitly invoke another constructor"
	public Pedido(int identificacao, String nome, String descricao, int quantidade, int valor) {
		this.identificacao = identificacao;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
}
