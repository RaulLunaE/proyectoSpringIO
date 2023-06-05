/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousuario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author Raul
 */
@Data
@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrol")
    private int idrol;
    
    @Size(min = 3, max = 10, message = "El nombre del rol debe tener entre 3 y 10 caracteres")
    @NotBlank(message = "Por favor registre el nombre/tipo de rol por favor")
    @Column(name = "nombrerol")
    private String nombrerol;
    
    @Size(min = 5, max = 200, message = "La descripcion debe tener entre 5 y 200 caracteres")
    @NotBlank(message = "La descripcion no esta correctamente escrito")
    @Column(name = "descripcion")
    private String descripcion;
    
    @Size(min = 4, max = 10, message = "El estado debe tener entre 5 y 200 caracteres")
    @NotBlank(message = "El estado no es valido")
    @Column(name = "estado")
    private String estado;
}
