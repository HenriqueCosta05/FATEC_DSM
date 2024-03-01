# Aula 02 - Padrões de Projeto 1: Strategy

# Padrões de operações

- **Operação**: especificação de um serviço que pode ser requisitado por uma instância de uma classe.
- **Método**: implementação de uma operação. Um método tem uma assinatura.
- **Assinatura**: descreve uma operação com um nome, parâmetros e tipo de retorno.
- **Algoritmo**: uma sequência de instruções que aceita entradas e produz saída. Pode ser um método, parte de um método ou pode consistir de vários métodos.

# O padrão strategy

> “*Definir uma família de algoritmos, encapsular cada um, e fazê-los intercambiáveis. `Strategy` permite que algoritmos mudem independentemente entre clientes que os utilizam”* - GoF.
> 
- Encapsula uma operação fazendo com que as outras sejam intercambiáveis

## Classe dinâmica e classe estática de uma variável

Este princípio define que uma variável declarada como do tipo da superclasse poderia **manter um valor da subclasse**.

- **Classe estática de uma variável**: é a classe que foi usado na **declaração da variável**, definida tempo de compilação e não sofre mudança.
- A **classe dinâmica de uma variável** é a classe associada **com o valor que ela atualmente guarda**. A classe dinâmica pode mudar durante o curso da execução como uma variável é atribuída a novos valores.

## Estrutura do padrão strategy

![Untitled](./Aula%2002%20-%20Padrões%20de%20Projeto%201%20Strategy%203fa302d787cf433b9435c00cd80609b3/Untitled.png)

- Um contexto repassa requisições de seus clientes para sua estratégia. Clientes geralmente criam e passam uma `EstrategiaConcreta` para o contexto. Depois, clientes apenas interagem com o contexto.
- `Estrategia` e `Contexto` interagem para implementar o algoritmo escolhido. Um contexto pode passar todos os dados necessários ou uma cópia de si próprio.

# Quando usar?

- Quando classes relacionadas forem diferentes apenas no **seu comportamento**
    - Strategy oferece um meio para configurar a classe com um entre vários componentes.
- Quando você precisar de diferentes variações de um mesmo algoritmo
- Qaundo um algoritmo usa dados que o **cliente não deve conhecer**
- Quando uma classe define **muitos comportamentos**, e estes aparecem como múltiplas declarações condicionais em suas operações.
    - Strategy permite implementar as operações usando polimorfismo.

# Exercício de fixação

[Tarefa - Strategy](./Aula%2002%20-%20Padrões%20de%20Projeto%201%20Strategy%203fa302d787cf433b9435c00cd80609b3/Tarefa%20-%20Strategy.md)