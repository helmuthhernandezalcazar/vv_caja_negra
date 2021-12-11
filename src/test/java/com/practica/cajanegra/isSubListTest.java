package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class isSubListTest {

	private SingleLinkedListImpl<String> miLista;
	private SingleLinkedListImpl<String> subListInexistente = new SingleLinkedListImpl<>("B", "A", "X");
	private SingleLinkedListImpl<String> subListUnica = new SingleLinkedListImpl<>("B", "A");
	private SingleLinkedListImpl<String> subListRepetida = new SingleLinkedListImpl<>("A", "B");
	private SingleLinkedListImpl<String> subListVacia = new SingleLinkedListImpl<>();
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "B", "A", "B", "C");
	}
	
	@Test
	@DisplayName("Sublista Inexistente")
	public void isSubList1() {
		int respuesta = this.miLista.isSubList(subListInexistente);
		assertEquals(-1, respuesta);
	}
	
	@Test
	@DisplayName("Sublista Unica")
	public void isSubList2() {
		int respuesta = this.miLista.isSubList(subListUnica);
		assertEquals(2, respuesta);
	}
	
	@Test
	@DisplayName("Sublista Repetida")
	public void isSubList3() {
		int respuesta = this.miLista.isSubList(subListRepetida);
		assertEquals(1, respuesta);
	}
	
	@Test
	@DisplayName("Sublista Vacia")
	public void isSubListVacia() {
		int respuesta = this.miLista.isSubList(subListVacia);
		assertEquals(0, respuesta);
	}
	
}
