package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.videoConsolas.modelo.Consola;
import com.example.demo.videoConsolas.modelo.JuegoExclusivo;
import com.example.demo.videoConsolas.service.IConsolaService;


@SpringBootApplication
public class VideoConsolasApplication implements CommandLineRunner{

	@Autowired
	private IConsolaService consolaService;
	
	public static void main(String[] args) {
		SpringApplication.run(VideoConsolasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Consola c1=new Consola();
		c1.setAnioLanzamiento(2013);
		c1.setNombre("PlayStation 4");
		
		JuegoExclusivo j1=new JuegoExclusivo();
		j1.setConsola(c1);
		j1.setNombre("God of War Ragnarok");
		j1.setPrecio(new BigDecimal(59.99));
		
		JuegoExclusivo j2=new JuegoExclusivo();
		j2.setConsola(c1);
		j2.setNombre("Marvel's Spider-Man");
		j2.setPrecio(new BigDecimal(39.99));
		
		JuegoExclusivo j3=new JuegoExclusivo();
		j3.setConsola(c1);
		j3.setNombre("The Last of Us Part II");
		j3.setPrecio(new BigDecimal(39.99));
		
		List <JuegoExclusivo>lista1= new ArrayList<>();
		lista1.add(j1);
		lista1.add(j2);
		lista1.add(j3);
		
		c1.setExclusivos(lista1);
		
		consolaService.agregar(c1);
		c1.setNombre("PlayStation 5");
		consolaService.actualizar(c1);
		consolaService.buscarTodos(c1.getId()).getExclusivos().forEach(System.out::println);
		consolaService.eliminar(c1.getId());
		
	}

}
