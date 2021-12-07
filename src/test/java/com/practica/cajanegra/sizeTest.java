package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

class size {
	private SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<String>();
	private SingleLinkedListImpl<String> listaConElementos = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
	
	@DisplayName("Test sizeVacio()")
	@Test
	public void sizeVacia() {
		assertEquals(0, this.listaVacia.size());
	}
	
	@DisplayName("Test sizeConElementos()")
	@Test
	public void sizeConElementos() {
		assertEquals(5, this.listaConElementos.size());		
	}
}
