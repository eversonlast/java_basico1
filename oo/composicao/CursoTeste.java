package oo.composicao;

public class CursoTeste 
{
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Jo�o");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Fernanda");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web Completo 2023");
		Curso curso3 = new Curso("Native Reactive");
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno1);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for( Aluno aluno : curso2.alunos) {
			System.out.println("Estu matriculado no curso de " + curso2.nome + "...");
			System.out.println("e o meu nome � " + aluno.nome);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
