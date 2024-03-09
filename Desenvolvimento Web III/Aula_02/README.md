# Aula 02 - O padrão MVP (Model-View-Presenter)

## Conceito

O `MVP` é um padrão arquitetônico que aborda algumas das desvantagens da abordagem MVC tradicional. Foi introduzido pela primeira vez na década de 1990 como uma **especialização do MVC**, **com foco em melhorar a separação de interesses entre a visão e o modelo**. O MVP divide os componentes do aplicativo em **três partes principais: Modelo, Visualização e Apresentação**.

## Model

Representa os dados e a lógica de negócios da aplicação, semelhante ao modelo em MVC. É responsável por **processar, armazenar e gerenciar dados, bem como implementar quaisquer regras de negócio necessárias**.

> [!TIP] 
> O modelo não se comunica diretamente com a visualização ou com o apresentador.


## View

Representa a interface do usuário e a camada de apresentaçãod a aplicação. Assim como na view do MVC, sua **função principal é exibir os dados obtidos do modelo**. No entanto, no MVP, a visualização é **mais passiva e depende do apresentador para atualizações e tratamento de entradas do usuário**. 

> [!TIP]
> A visualização se comunica apenas com o apresentador, e não com o modelo.


## Presenter

Atua como **ponte entre o modelo e a visão**, assumindo algumas das responsabilidades do controlador no MVC. O presenter **busca os dados do modelo e atualiza a visualização, garantindo a apresentação correta dos dados**. Ao contrário do controlador, o **apresentador também trata a entrada do usuário diretamente da view**, facilitando a comunicação bidirecional entre as duas partes.

# MVP vs MVC

A principal diferença entre MVC e MVP está **nas funções do controlador e do apresentador**. No MVP, o **apresentador se envolve mais nas interações do usuário e no fluxo de dados** entre a visualização e o modelo, deixando a **visualização como um componente passivo**. 

Esta separação de preocupações permite **maior testabilidade e modularidade, já que cada componente pode ser isolado independentemente**.

# Prós e Contras do MVP

## Vantagens

- Separação aprimorada das **preocupações** entre view e model
- O presenter **facilita** melhor testabilidade e modularidade
- Cada componente pode ser modificado ou substituído sem afetar os outros
- Mais adequado para aplicações com requisitos compexos de estado ou interação.

## Desvantagens

- Maior complexidade em comparação com o MVC tradicional, devido às responsabilidades adicionais do apresentador.
- Pode levar a uma base de código maior e à necessidade de mais código padrão.
- Potencial para sobrecarga de comunicação entre os componentes.