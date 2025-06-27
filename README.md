[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/T2vUNN1h)

QUESTÃO 4

► a
Como a memória é alocada em cada caso?
Tipos primitivos (int[], double[]):
A memória do array é alocada de forma contínua e cada posição guarda diretamente o valor.

Objetos (Aluno[]):
O array aloca memória para referências (endereços). Os objetos em si são alocados separadamente na memória (heap) quando você usa new.


► b
Cuidados ao acessar elementos de um array de objetos:
Sempre verifique se o objeto não é null antes de usar:

if (alunos[0] != null) {
    System.out.println(alunos[0].getNome());
}

Evite acessar métodos ou atributos se o elemento ainda não foi inicializado com new, pois isso causa NullPointerException.