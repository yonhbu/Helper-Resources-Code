package com.ejercicio.mockito.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ejercicio.mockito.services.SaludosService;

public class SaludosServiceTest {
	
	   @Test
	   public void saludoTest () {
		   
		   SaludosService saludosService = new SaludosService();
		   assertNotNull(saludosService.saludo());
	    }

}
