# Aula 01 - TDD: Test Driven Development

# Teste de Software

- Testar é o processo de comparar **o que é** com **o que deveria ser**
- De acordo com o IEEE Standard Glossary of Software Engineering Terminology, testar é:

> [!NOTE]
> “O processo de operar um sistema ou componente sob condições especificadas, observando (e/) ou registrando os resultados, enquanto avalia o sistema ou componente sob algum aspecto.

# O que são testes na Engenharia de Software

- Teste de software é **todo e qualquer procedimento que ajuda a determinar se o programa atinge as as expectativas** as quais foi criada.
- Um teste de software é um **software que executa outro software**. Ele valida se esse código resultará no estado esperado (teste de estado) ou executa a sequência esperada de eventos (teste de comportamento).
- As técnicas de teste incluem, mas não são limitadas ao processo de execução de um programa ou aplicação com a intenção de descobrir **defeitos** ou **falhas** (bugs) no software.

# Níveis de maturidade no teste

- **Nível 1**: o propósito do teste é **mostrar que o software funciona** (não falha).
- **Nível 2**: o propósito é mostrar que o **software não funciona**, para algum conjunto de dados. Em quais condições o software falha?
- **Nível 3**: o propósito do teste **não** é mostrar que o software **funciona ou não funciona**, mas reduzir o risco percebido, caso ele não funcione para algum conjunto de valores.
- **Nível 4**: testar, neste nível, não é um simples ato. É uma disciplina mental que resulta em software de baixo risco, como pouco esforço no teste.

# Desafios do Teste

- **Pouco** tempo para testar adequadamente
- **Muitas** combinações de entrada
- Dificuldade de determinar a **saída** correta (**oráculo)**
- Requisitos **não existentes** ou **variáveis**
- **Falta** de ferramenta de teste
- Geremte que não **entende** ou aparentemente não se importa com a qualidade do software.
- **Falta de tempo** para testar adequadamente.

# Defeito, erro, falha

- O International Software Testing Qualifications Board (ISTQB) traz as seguintes definições:

## Erro

- Falha humana: produz reultado incorreto
- É, por exemplo, a falha na escrita de um código específico.

## Defeito

- Resultado de um código mal escrito, ou seja, um erro.
- Causa anomalia no funcionamento do sistema. O usuário final normalmente não vê o defeito propriamente dito.
- Também é conhecido como **bug**

## Falha

- Quando um código que apresenta um defeito é executado, temos uma falha.
- Funcionamento **inesperado** das funções do software.
- É a camada que chega aos olhos do usuário.

# Testes no processo de Engenharia de Software

- Definição de requisitos
- Projeto de sistema e software
- Implementação e teste unitário
- Integração e teste de sistema
- Operação e manutenção

# Verificação e validação

## Validação

- Confirmar por testes e com provas objetivas que os requisitos particulares para um determinado uso foram cumpridos.
- Busca provar que o software implementa cada um dos requisitos **corretamente e completamente**, ou seja, tenta responder à pergunta:

> [!NOTE]
> O produto **correto foi construído**?

## Verificação

- Confirmar por testes e com provas objetivas que requisitos especificados foram cumpridos.
- Visa garantir que os produtos de uma dada fase implementam em sua totalidade as entradas àquela fase, ou seja, tenta responder à pergunta:

> [!NOTE]
> O produto **foi construído corretamente**?

# O Modelo V

O modelo em V é uma abordagem metódica para o desenvolvimento de projetos. Esta abordagem segue uma sequência de fases lineares e interdependentes, com uma **correspondência** entre cada fase ascendente e uma fase descendente associada.

## Vantagens

### Estrutura clara

Oferece uma estrutura bem definida com fases distintas, facilitando o planejamento e a organização do projeto.

### Gerenciamento de requisitos

A primeira fase é a **coleta de requisitos**, portanto, define claramente as necessidades do projeto (reduzindo risco de modificações constantes).

### Documentação completa

Inclui documentação detalhada em todas as fases, facilitando a manutenção posterior e a compreensão da funcionalidade do sistema.

### Redução de riscos

Enfatiza os testes durante todo o processo, permitindo que os problemas sejam identificados e corrigidos mais cedo.

## Desvantagens

### Falta de flexibilidade

Menos adequado para projetos em que as mudanças são frequentes ou para fazer ajustes rápidos.

### Tempo de desenvolvimento prolongado

Leva tempo para concluir um projeto em comparação com **métodos mais iterativos e flexíveis**.

### Envolvimento não confiável do cliente

A participação e o feedback do cliente são geralmente solicitados principalmente durante a fase de validação, o que pode limitar as ações.

## As 9 etapas essenciais

### Fase de Design

A fase de design consiste na **tradução dos requisitos do projeto em uma visão global do sistema**, por meio de três subetapas principais:

- **Análise de requisitos**: compreende e documenta as necessidades funcionais e **não funcionais** do projeto. O objetivo dessa etapa é **garantir que todos os requisitos** sejam claramente definidos e compreendidos pela equipe de desenvolvimento.
- **Projeto preliminar**: estabelece uma visão geral da solução técnica. Ela envolve a identificação dos principais componentes do sistema, a definição de sua arquitetura geral e o estabelecimento das interações e interfaces entre esses pontos. Em suma, tem como objetivo fornecer uma base sólida para o restante do projeto.
- **Projeto detalhado**: especifica detalhadamente cada componente do sistema, incluindo a definição precisa de algoritmos, estruturas de dados, interfaces internas e externas, interações entre diferentes módulos. Baseia-se constantemente no projeto preliminar, analisando os aspectos técnicos e específicos de cada elemento do projeto.

### Fase de Implementação

Durante essa fase, os desenvolvedores transformam a especificação técnica em realidade. Essa fase desempenha papel fundamental na criação de um **software funcional**, robusto e de alta qualidade.

- **Codificação**: depois de definir o design detalhado, os desenvolvedores traduzem esse design em código-fonte. É essencial escrever códigos claros, bem organizados e comentados para facilitar a manutenibilidade e a colaboração com outros desenvolvedores.
- **Testes unitários**: envolvem a **verificação** de cada módulo ou componente de software individualmente, isolando e testando partes específicas do código. Auxiliam a detectar e corrigir problemas rapidamente, melhorando a **confiabilidade do software**.
- **Integração**: verifica se os vários componentes **interagem corretamente** e trabalham juntos de forma harmoniosa. São realizados para **verificar a compatibilidade, as interfaces e a comunicação entre os módulos**.

### Fase de validação

O principal objetivo dessa fase é **garantir que o software** atenda aos requisitos funcionais e não funcionais definidos durante a **fase de projeto**.

- **Teste de validação**: visa garantir que o sistema **atenda aos requisitos funcionais e não funcionais do projeto**. Os testes de **validação** são realizados em nível global, avaliando o sistema como um todo.
- **Verificação da conformidade**: envolve a garantia de que o software está em conformidade com os padrões, as regulamentações e as especificações técnicas definidas.
- **Aceitação do cliente**: envolve a obtenção da aprovação do cliente ou do usuário final quanto à qualidade e à conformidade do sistema desenvolvido.

# Testes de Caixa Preta e Caixa Branca

## Teste Caixa Branca

- Possui acesso ao código-fonte, conhecendo a estrutura interna do produto
- Permite uma busca do **comportamento da estrutura**.
- Os níveis de teste caixa branca são os **Testes de Unidade e o Teste Estático.**

## Teste Caixa Preta

- Baseia-se nos requisitos básicos do software, sendo o foco as **ações que devem-se desempenhar**.
- Os níveis de teste caixa preta são **Integração**, **Sistema**, **Aceitação**, **Alfa** e **Beta**.
- Possuem métodos e **classes**, **comandos de repetição** e **condições.**
- Resumem-se em testes de entrada e saída.

# Testes Unitários com JUnit

> [!NOTE]
> JUnit é um framework open-source, criado para suporte a testes automatizados de códigos escritos na linguagem Java.


## Por que o teste unitário é importante?

- Os testes de unidade de software **ajudam o** **desenvolvedor a verificar se a lógica de um componente do código está correta**.
- A execução de **testes automaticamente ajuda a identificar as regressões de software** introduzidas por **mudanças no código-fonte**. Ter uma **alta** cobertura de teste do seu código permite que você continue desenvolvendo recursos sem ter que realizar muitos testes manuais.

## Anotações do JUnit

| Anotações do JUnit 4/5 | Descrição |
| --- | --- |
| @Test | Identifica um método como um método de teste. |
| @Before | Executa o método de teste antes de cada teste, sendo usado para preparar o ambiente de teste. |
| @After |  Executa o método do teste depois de cada teste. É usado para limpar o ambiente de teste. |
| @BeforeAll | Executado uma única vez, antes de iniciar todos os testes. |
| @AfterAll | Executado uma única vez, depois que todos os testes foram finalizados. |
| @Disabled | Sinaliza que o teste deveria estar desabilitado. É útil quando o código foi mudado e o caso de teste ainda não foi adaptado. |
| @Test(timeout=100) | Falha se o método leva mais do que 100 milissegundos para ser executado. |