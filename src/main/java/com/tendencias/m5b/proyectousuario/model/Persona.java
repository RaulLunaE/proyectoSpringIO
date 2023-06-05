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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int idpersona;
    
    @Size(min = 5, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    @NotBlank(message = "El nombre no cumple con las condiciones requeridas")
    @Column(name = "nombrepersona")
    private String nombrepersona;
    
    @Size(min = 5, max = 50, message = "El apellido debe tener entre 3 y 50 caracteres")
    @NotBlank(message = "El apellido no esta correctamente escrito")
    @Column(name = "apellidopersona")
    private String apellidopersona;
    
    @Size(min = 6, max = 150, message = "El correo debe tener entre 6 y 150 caracteres")
    @NotBlank(message = "El correo no esta correctamente escrito")
    @Column(name = "correo")
    private String correo;
    
    @Size(min = 10, max = 10, message = "La cedula debe contener 10 caracteres")
    @NotBlank(message = "La cedula no esta completa")
    @Column(name = "cedula")
    private String cedula;
    
    @Size(min = 4, max = 150, message = "La direccion debe contener entre 4 y 150 caracteres")
    @NotBlank(message = "La direccion esta incorrecta")
    @Column(name = "direccion")
    private String direccion;
    
    @Size(min = 8, max = 10, message = "La fecha debe contener entre 8 y 10 caracteres")
    @NotBlank(message = "La fecha esta incorrecta")
    @Column(name = "fechanacimiento")
    private String fechanacimiento;
    
    @Size(min = 4, max = 50, message = "La direccion debe contener entre 4 y 50 caracteres")
    @NotBlank(message = "La instruccion no es valida")
    @Column(name = "instruccion")
    private String instruccion;
    
    @Size(min = 7, max = 10, message = "La direccion debe contener entre 7 y 10 caracteres")
    @NotBlank(message = "El celular no es valido")
    @Column(name = "celular")
    private String celular;
    /*
    Campo de persona
    idpersona
    nombre
    apellido
    correo
    cedula
    direccion
    fechanacimiento
    instruccion (nivel academico)
    celular
    */
}
