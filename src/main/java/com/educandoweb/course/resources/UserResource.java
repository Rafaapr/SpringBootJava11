package com.educandoweb.course.resources;


// Este é nosso controlador West q responde no caminho user
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;


// Controlador UEST usamos anotation o recurso Web
@RestController
// Vamos dar um nome para nosso recurso e colocar um valor para ele 
@RequestMapping(value = "/users")
public class UserResource {
	// EndPoint
	// Retornar responsta de requisição Web e ele espera um tipo de resposta q vai ser a class User
	// Damos um nome para o method findAll q vai retornar meus usuários
	// Precisamos especificar q o method responde a requisição do tipo get do Http Vamos colocar um anotation @GetMapping
	@GetMapping
	public ResponseEntity<User> findAll(){
		// Instanciando User u = new User
		// Utiliza o construtor da class User. no Id utilizamos especificamos q ele é long
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
		// O method vai retornar .ok para retornar resposta com sucesso e o .body para retornar o corpo da resposta q é o usuário u
		return ResponseEntity.ok().body(u);
		
	}

}
