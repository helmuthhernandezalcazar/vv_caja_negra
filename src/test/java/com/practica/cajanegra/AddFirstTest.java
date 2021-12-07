package com.practica.cajanegra;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.*;

public class AddFirstTest {
	private SingleLinkedListImpl<String> lista;
	
	@BeforeEach
	public void crearLista() {
		this.lista = new SingleLinkedListImpl<String>("A", "S", "C", "I");
	}
	
	@ParameterizedTest(name="Añadir {0} al principio")
	@ValueSource(strings= {"A", "B", "M", "Y", "Z", "@", "["} )
	public void addFirst(String s) {
		this.lista.addFirst(s);
		assertEquals("["+ s + ", A, S, C, I]", this.lista.toString());	
	}
	
}
