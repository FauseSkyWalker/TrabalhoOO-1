package com.trabalhoOO.agencia.model;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
    @Autowired
    private BoletoService boletoService;

    @Autowired
    private CartaoService cartaoService;

    @PostMapping("/boleto")
    public ResponseEntity<Boleto> gerarBoleto(@RequestBody Voo voo) {
        Boleto boleto = boletoService.gerarBoleto(voo);
        return ResponseEntity.ok(boleto);
    }

    @PostMapping("/cartao")
    public ResponseEntity<Cartao> parcelarCompra(@RequestBody Voo voo, @RequestParam Integer parcelas) {
        Cartao cartao = cartaoService.parcelarCompra(voo, parcelas);
        return ResponseEntity.ok(cartao);
    }
}
