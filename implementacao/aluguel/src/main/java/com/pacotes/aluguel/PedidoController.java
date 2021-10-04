package com.pacotes.aluguel;


import com.pacotes.aluguel.model.Pedido;
import com.pacotes.aluguel.service.PedidoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public String alugar(
            @RequestParam(value = "userId", required = true) int userId,
            @RequestParam(value = "autId", required = true) int autId,
            Model model) {

        Pedido pedido = new Pedido();
        pedido.setUsuario_id( Long.valueOf(userId) );
        pedido.setAutomovel_id( Long.valueOf(autId) );
        pedido = pedidoService.createPedido(pedido);

        return "redirect:/pedido";
    }

    @GetMapping
    public String pedidoList(Model model) {
        List<Pedido> pedidos = pedidoService.getPedidos();
        model.addAttribute("pedidos", pedidos);

        return "pedidoList";
    }


}