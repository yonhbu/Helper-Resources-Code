package com.ejercicio.mockito.controller;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.ejercicio.mockito.controllers.SaludosController;
import com.ejercicio.mockito.services.SaludosService;


@RunWith(MockitoJUnitRunner.class)
public class SaludosControllerTest {
	

    @Mock
	SaludosService greetingService;
    
    @InjectMocks
    SaludosController saludosController;
    
    
	@Before
	public void init () {
		System.out.println("Iniciamos El Mock");
		MockitoAnnotations.initMocks(this);	
		when(greetingService.saludo()).thenReturn("Hola");
	}
	

	@Test
	public void darSaludoTest () {

		assertEquals("Hola", saludosController.darSaludo().getBody());
		
	}
}