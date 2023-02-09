package com.trabalhoOO.agencia.model;

@Service
public class BoletoService {
  private Boleto boleto;

  public Boleto gerarBoleto(double valorCompra) {
    boleto = new Boleto();
    boleto.setValor(valorCompra);
    boleto.setDataVencimento(gerarDataVencimento());
    boleto.setNumero(gerarNumeroAleatorio());
    return boleto;
  }

  private LocalDate gerarDataVencimento() {
    LocalDate dataAtual = LocalDate.now();
    return dataAtual.plusDays(30);
  }

  private long gerarNumeroAleatorio() {
    int dígitos = 12;
    return (long) (Math.random() * (Math.pow(10, dígitos) - Math.pow(10, dígitos - 1)))
        + (long) Math.pow(10, dígitos - 1);
  }
}