package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import com.cajanegra.EmptyCollectionException;
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
	
	@DisplayName("Sublista Inexistente")
	@Test
	public void isSubList1() {
		int respuesta = this.miLista.isSubList(subListInexistente);
		assertEquals(-1, respuesta);
	}
	
	@DisplayName("Sublista Unica")
	@Test
	public void isSubList2() {
		int respuesta = this.miLista.isSubList(subListUnica);
		assertEquals(2, respuesta);
	}
	
	@DisplayName("Sublista Repetida")
	@Test
	public void isSubList3() {
		int respuesta = this.miLista.isSubList(subListRepetida);
		assertEquals(1, respuesta);
	}
	
	@DisplayName("Sublista Vacia")
	@Test
	public void isSubListVacia() {
		int respuesta = this.miLista.isSubList(subListVacia);
		assertEquals(0, respuesta);
	}
	
}
