package com.trabalhoOO.agencia.model;

@Service
public class PagamentoService {
  
  @Autowired
  private BoletoService boletoService;
  
  @Autowired
  private CartaoService cartaoService;
  
  public void gerarPagamento(Voo voo, AluguelCarro aluguelCarro, Hotel hotel){
    float valorTotal = voo.getValor() + aluguelCarro.getValor() + hotel.getValor();
    System.out.println("Valor total da compra: " + valorTotal);
  }
  
  public void gerarBoleto(){
    boletoService.gerarBoleto();
  }
  
  public void parcelarCompra(int numeroParcelas){
    cartaoService.parcelarCompra(numeroParcelas);
  }
  
  public class PagamentoService {
	  private boolean compraFinalizada = false;

	  public boolean isCompraFinalizada() {
	    return compraFinalizada;
	  }

	  public void setCompraFinalizada(boolean compraFinalizada) {
	    this.compraFinalizada = compraFinalizada;
	  }
	}
  
}

