package application;

import java.util.Arrays;
import java.util.List;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		pessoas.forEach(System.out::println);
	}
}