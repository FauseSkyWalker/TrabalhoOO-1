package com.trabalhoOO.agencia.model;
import org.springframework.stereotype.Service;

@Service
public class CartãoService {
  public int parcelarCompra(int valorCompra) {
    System.out.println("Informe o número de parcelas desejado (de 1 a 12): ");
    Scanner scan = new Scanner(System.in);
    int parcelas = scan.nextInt();

    while (parcelas < 1 || parcelas > 12) {
      System.out.println("Informe um número válido de parcelas (de 1 a 12): ");
      parcelas = scan.nextInt();
    }

    int valorParcela = valorCompra / parcelas;
    System.out.println("O valor de cada parcela será de R$ " + valorParcela);

    return valorParcela;
  }
}
