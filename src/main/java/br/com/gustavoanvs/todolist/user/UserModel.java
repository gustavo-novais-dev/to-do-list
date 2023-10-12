package br.com.gustavoanvs.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data //para definir tanto os getters e os setters  
@Entity(name="tb_users") //para ser tabela no DB
public class UserModel {

    @Id // annotation do JPA para sinalizar que se trata de uma chave unica
    @GeneratedValue(generator = "UUID") // para o UUID crair um codigo automático
    private UUID id; // tipo para gerar chave unica

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
