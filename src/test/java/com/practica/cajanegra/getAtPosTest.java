package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

public class getAtPosTest {
	
	private SingleLinkedListImpl<String> lista;
	private SingleLinkedListImpl<String> listaVacia = new SingleLinkedListImpl<String>();
	
	@BeforeEach
	public void setUp() {
		this.lista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "B", "Z");
	}
	
	@DisplayName("Test getAtPos()")
	@ParameterizedTest(name="getAtPos del elemento {0}")
	@ValueSource(ints= {1, 2, 3, 4, 5, 6})
	public void getAtPosEncontrado(int i) {
		Map<Integer, String> res = new HashMap<Integer, String>();
		res.put(1, "A");
		res.put(2, "B");
		res.put(3, "M");
		res.put(4, "Y");
		res.put(5, "B");
		res.put(6, "Z");
		
		assertEquals(res.get(i), this.lista.getAtPos(i));
	}

	@Test
	@DisplayName("Test getAtPos cuando no hay")
	public void getAtPosNoHay() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.listaVacia.getAtPos(1);
		});		
	}

	@Test
	@DisplayName("Test getAtPos menor que cero")
	public void getAtPosMenorCero() {	
		assertThrows(IllegalArgumentException.class, () -> {
			this.lista.getAtPos(-1);
		});
	}

	@Test
	@DisplayName("Test getAtPos mayor que size")
	public void getAtPosMayorSize() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.lista.getAtPos(7);
		});
	}	
}
