package com.pacotes.aluguel.service;

import com.pacotes.aluguel.model.Pedido;
import com.pacotes.aluguel.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> getPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido createPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
