package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

class sizeTest {
	
	private SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<String>();
	private SingleLinkedListImpl<String> listaConElementos = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
	
	@Test
	@DisplayName("Test sizeVacio()")
	public void sizeVacia() {
		assertEquals(0, this.listaVacia.size());
	}
	
	@Test
	@DisplayName("Test sizeConElementos()")
	public void sizeConElementos() {
		assertEquals(5, this.listaConElementos.size());		
	}
}
