package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conteudo curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		((Curso)curso1).setCargaHoraria(8);
	
		Conteudo curso2 = new Curso();
		curso2.setTitulo("Curso Spring");
		curso2.setDescricao("descrição curso Spring");
		((Curso)curso2).setCargaHoraria(6);
		
		
		Conteudo mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição mentoria java");
		((Mentoria) mentoria1).setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devOzeias = new Dev();
		devOzeias.setNome("Ozeias");
		devOzeias.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devOzeias.getConteudosInscritos());
		devOzeias.progredir();
		devOzeias.progredir();
		System.out.println("Conteúdos Inscritos" + devOzeias.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devOzeias.getConteudosConcluidos());
		System.out.println("XP: " + devOzeias.calculaXp());
	}

}
