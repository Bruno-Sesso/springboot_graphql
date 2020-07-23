package com.udemy.compras.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraInput {

    private Long id;
    private Long quantidade;
    private String status;

    private Long clienteId;
    private Long produtoId;
}
