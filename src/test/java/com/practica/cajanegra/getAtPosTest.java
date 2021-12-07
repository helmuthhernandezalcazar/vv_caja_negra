package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

class getAtPosTest {
	private SingleLinkedListImpl<String> lista;
	
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

	//no se encuentra el elemento
	public void assertThrowsExceptionNoHay(int pos) {
		assertThrows(IllegalArgumentException.class, () -> {
			this.lista.isEmpty();
		});		
	}
	
	//posición menor que cero
	public void assertThrowsExceptionMenorCero(int pos) {	
		assertThrows(IllegalArgumentException.class, () -> {
			this.lista.getAtPos(-1);
		});
	}
	
	//posición mayor que la longitus de la cadena
	public void assertThrowsExceptionMayorSize(int pos) {
		assertThrows(IllegalArgumentException.class, () -> {
			this.lista.getAtPos(6);
		});
		
	}	
}
