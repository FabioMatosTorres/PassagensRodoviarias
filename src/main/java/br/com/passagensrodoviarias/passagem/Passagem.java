package br.com.passagensrodoviarias.passagem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.com.passagensrodoviarias.cidade.Cidade;
import br.com.passagensrodoviarias.veiculo.Veiculo;

public class Passagem implements Serializable

{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4833186252469896397L;
	private int idPassagem;
	private Veiculo veiculo;
	private int poltrona;
	private Date dataSaida;
	private String horaSaida;
	private Cidade cidadeOrigem;
	private Cidade cidadeDestino;
	private BigDecimal valorPassagem;

	public int getIdPassagem() {
		return idPassagem;
	}

	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public Cidade getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(Cidade cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public BigDecimal getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(BigDecimal valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataSaida == null) ? 0 : dataSaida.hashCode());
		result = prime * result
				+ ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result + idPassagem;
		result = prime * result + poltrona;
		result = prime * result
				+ ((valorPassagem == null) ? 0 : valorPassagem.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		if (dataSaida == null) {
			if (other.dataSaida != null)
				return false;
		} else if (!dataSaida.equals(other.dataSaida))
			return false;
		if (horaSaida == null) {
			if (other.horaSaida != null)
				return false;
		} else if (!horaSaida.equals(other.horaSaida))
			return false;
		if (idPassagem != other.idPassagem)
			return false;
		if (poltrona != other.poltrona)
			return false;
		if (valorPassagem == null) {
			if (other.valorPassagem != null)
				return false;
		} else if (!valorPassagem.equals(other.valorPassagem))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}

}
