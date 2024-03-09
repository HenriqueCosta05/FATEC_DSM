# Aula 02 - Modelagem de Dados NoSQL

# Modelagem de dados

O principal desafio na modelagem de dados é equilibrar as necessidades do aplicativo, as características de desempenho do mecanismo de banco de dados e os padrões de recuperação de dados.

Ao projetar modelos de dados, considerar sempre o uso de **aplicativos de dados** (ou seja, consultas, atualizações e processamento dos dados), bem como a estrutura inerente dos dados em si.

- Temos três tipos:
    - Caracterização do Workload
    - Identificação e Modelagem dos Relacionamentos
    - Aplicação de Design Patterns

## Caracterização do Workload

- Levantamento dos dados e a carga do sistema, seu layout, suas telas e funcionalidades.
- **Levantamento de requisitos**
    - Usando uma das práticas de levantamento de requisito conhecida como entrevista, os analistas conversam com o cliente para **entender tudo o que deve ter no sistema**.
    - A realização do levantamento de requisitos é o **primeiro passo para obter um sistema que atenda às necessidades do cliente** (Engenharia de Software).
- **Analista funcional / Negócio**
    - Um plano de negócio é um documento que **descreve por escrito os `objetivos de negócio` e quais passos devem ser dados** para que esses objetivos sejam alcançados.
- **Informações o Workload de ambientes existentes**
    - Tamanho (carga) do banco de dados
    - Verificação do ambiente de trabalho
    - Documentos tem um limite de 16MB.
- **Modelo de telas de aplicação**
    - Prototipagem de software ou aplicativo

## Identificação e modelagem dos relacionamentos

- Vamos usar a cardinalidade do banco de dados relacional, sendo:
    - Relacionamento de 1 para 1
    - Relacionamento de 1 para N ou de N para 1 quando for o caso
    - Relacionamento de N para N.
- Esquema de dados:
    - Lista de suposições
    - Lista de operações no BD
    - Collection Relationship Diagram (CRD)
    - Tamanho do BD
    - Lista de índices

## Aplicação de Design patterns

>[!TIP] 
> **Definição:** são as soluções generalistas para problemas que surgem de forma recorrente ao longo do desenvolvimento de softwares.


São soluções elegantes, prontas, pensadas, testadas e aprovadas para situações comuns e que surgem no cotidiano.

- Rever todo o processo para verificar se tem como otimizar para fazer a entrega dos artefatos
- Usar a cabeça para resolver o problema

## Modelagem final - o que vamos entregar para o cliente?

- Entrega de uma tabela
- Entrega de um diagrama
- Dicionário
- Prototipagem
- Entrega de um modelo JSON, CSV, XML, etc.

# Esquema flexível

Ao contrário dos bancos de dados SQL, onde você deve determinar e declarar o esquema de uma tabela antes de inserir dados, o MongoDB’s, coleções, por padrão, não requerem documentos para ter o mesmo esquema.

| Relação no Banco de Dados | MongoDB / JSON |
| --- | --- |
| Base de Dados | Base de Dados |
| Tabela | Coleção |
| Registro | Documento |
| Coluna | Atributo |