package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

public class addAtPosTest {

	private SingleLinkedListImpl<String> miLista;
	private int tamanyoInicial;
	
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<>("A", "B", "M", "Y", "Z");
		this.tamanyoInicial = this.miLista.size();
	}
	
	@Test
	@DisplayName("addAtPosExcepcion")
	public void addAtPosFueraRango() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.miLista.addAtPos("A", 0);
		});	
	}
	
	@ParameterizedTest(name="Add at Pos Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addAtPosInicial(String s) {
		this.miLista.addAtPos(s, 1);
		assertEquals("[" + s + ", A, B, M, Y, Z]", this.miLista.toString());
		assertEquals(this.tamanyoInicial + 1, this.miLista.size());
	}
	
	@ParameterizedTest(name="Add at Pos Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addAtPosInicialMasUno(String s) {
		this.miLista.addAtPos(s, 2);
		assertEquals("[A, " + s + ", B, M, Y, Z]", this.miLista.toString());
		assertEquals(this.tamanyoInicial + 1, this.miLista.size());
	}
	
	@ParameterizedTest(name="Add at Pos Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addAtPosFinalMenosUno(String s) {
		this.miLista.addAtPos(s, 5);
		assertEquals("[A, B, M, Y, " + s + ", Z]", this.miLista.toString());
		assertEquals(this.tamanyoInicial + 1, this.miLista.size());
	}
	
	@ParameterizedTest(name="Add at Pos Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addAtPosFinal(String s) {
		this.miLista.addAtPos(s, 6);
		assertEquals("[A, B, M, Y, Z, " + s + "]", this.miLista.toString());
		assertEquals(this.tamanyoInicial + 1, this.miLista.size());
	}
	
	@ParameterizedTest(name="Add at Pos Last {0} in list")
	@ValueSource(strings= {"@", "A", "B", "M", "Y", "Z", "["})
	public void addAtPosNumeroElevado(String s) {
		this.miLista.addAtPos(s, 1000);
		assertEquals("[A, B, M, Y, Z, " + s + "]", this.miLista.toString());
		assertEquals(this.tamanyoInicial + 1, this.miLista.size());
	}
}
