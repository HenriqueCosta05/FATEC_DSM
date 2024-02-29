# Aula 01 - O que é NoSQL

# Definição

O termo NoSQL se refere a tipos não relacionais de bancos de dados, e esses bancos de dados armazenam dados em formato diferente das tabelas relacionais.

No entanto, os bancos de dados NoSQL podem ser consultados usando APIs de linguagem idiomática, linguagens de consulta estruturadas declarativas e linguagens de consulta, por exemplo, razão pela qual também são chamados bancos de dados `não apenas SQL`

# Para que é usado um banco de dados NoSQL?

Os bancos de dados NoSQL são amplamente usados em aplicativos da web em tempo real e big data, porque suas principais vantagens são **alta escalabilidade** e **alta disponibilidade**.

Os bancos de dados NoSQL também são a escolha preferida dos desenvolvedores, pois eles naturalmente **aceitam um paradigma de desenvolvimento ágil**, adaptando-se rapidamente aos requisitos em constante mudança.

Os bancos de dados NoSQL permitem que os dados sejam armazenados de maneiras mais intuitivas e fáceis de entender, ou mais próximas da **maneira como os dados são usados pelos aplicativos e com menos transformações necessárias ao armazenar ou recuperar** usando APIs no estilo NoSQL.

# SQL vs NoSQL

Os bancos de dados SQL são relacionais, enquanto os bancos de dados NoSQL são não relacionais.

O sistema de gerenciamento de banco de dados relacional (SGBD) é a base para a linguagem de consulta estruturada (SQL), que permite aos usuários acessar e manipular dados em tabelas altamente estruturadas.

Com bancos de dados NoSQL, a sintaxe de acesso a dados ao banco de dados é totalmente diferente.

## Bancos de dados relacionais

- Os dados são armazenados em tabelas em objetos de banco de dados que são chamados de tabelas.

> [!NOTE] 
> Uma tabela é uma coleção de entradas de dados relacionadas e consiste em colunas e linhas.

Esses bancos de dados requerem a definição do esquema com antecedência, ou seja, **todas as colunas e seus tipos de dados associados devem ser conhecidos de antemão para que os aplicativos possam gravar dados no banco de dados**.

- Eles também armazenam informações vinculando várias tabelas por meio do uso de chaves, criando assim um relacionamento entre várias tabelas.
- No caso mais simples, uma `chave` é usada para **recuperar uma linha específica para que ela possa ser examinada ou modificada**.

# Quando escolher um banco de dados NoSQL?

Os bancos de dados NoSQL oferecem **esquemas flexíveis e suportam uma variedade de modelos de dados que são ideais para a construção de aplicativos que requerem grandes volumes de dados** e baixa latência ou tempos de resposta, por exemplo: jogos online, aplicativos da web e e-commece.

# Quando NÃO escolher um banco de dados NoSQL?

Os bancos de dados **NoSQL normalmente dependem de dados desnormalizados**, suportando tipos de aplicativos que usam menos tabelas (ou contêineres) e cujos relacionamentos de dados não são modelados usando referências, mas sim como registros (ou documentos) incorporados.

- Muitos aplicativos de negócios de back-office clássicos em finanças, contabilidade e planejamento de recursos corporativos contam com **dados altamente normalizados** para evitar anomalias de dados, bem como a duplicação de dados.
- Esses são os tipos típicos de aplicativos que **NÃO SÃO ADEQUADOS para um banco de dados NoSQL**.
- Outra distinção dos bancos de dados NoSQL é a **complexidade da consulta**.
- Os bancos de dados NoSQL **funcionam incrivelmente bem com consultas em uma única tabela**
- Conforme a complexidade das consultas aumenta, os bancos de dados relacionais são uma **escolha melhor**.
- O banco de dados NoSQL normalmente **não oferece junções complexas**, subconsultas e **aninhamento de consultas** em uma cláusula WHERE.


> [!NOTE] 
> Não é necessário escolher entre bancos de dados relacionais e não relacionais. Em muitas ocasiões, as empresas optaram por bancos de dados que oferecem um modelo convergente, no qual podem empregar uma combinação de modelos de dados relacionais e não relacionais.

Essa abordagem híbrida oferece maior flexibilidade no tratamento de diferentes tipos de dados, ao mesmo tempo que garante a consistência de leitura e gravação sem degradar o desempenho.

# O que o NoSQL oferece que outros bancos de dados não oferecem?

Um dos principais diferenciais entre os bancos de dados NoSQL e outros tipos de bancos de dados é que os bancos de dados NoSQL **geralmente usam armazenamento não estruturado**.

Desenvolvidos nas últimas duas décadas, os bancos de dados NoSQL foram **projetados para consultas rápidas e simples, vastos dados e mudanças frequentes de aplicativos**.

Além disso, esses bancos de dados também tornam a **programação muito mais simples para os desenvolvedores**.

Diferenciador importante é que os **bancos de dados NoSQL dependem de um processo chamado `fragmentação` para escalar horizontalmente**, o que significa que **mais máquinas** podem ser adicionadas para lidar com dados em vários servidores.

A `escala vertical` encontrada em outros bancos de dados SQL requer a **adição de mais potência e memória à máquina** existente, o que pode ser insustentável à medida que mais e mais armazenamento é necessário.

A natureza do `escalonamento horizontal` com bancos de dados NoSQL significa que eles podem lidar com quantidades extremamente grandes de dados e mesmo enquanto os dados estão crescendo de maneira mais eficiente.

Na **`escala vertical`** é como adicionar um novo andar à sua casa, enquanto a `escala horizontal` é como construir outra casa ao lado da casa original.

# Benefício de um Banco de Dados NoSQL

A velocidade e escala sem precedentes da interação digital e do consumo de dados observada nas últimas duas décadas exigiram que as empresas adotassem uma **abordagem mais moderna e fluida de como armazenam os dados e como os acessam**.

Com usuários em todo o mundo estão exigindo um fluxo ininterrupto de conteúdo e funções, não é de se admirar que os bancos de dados tenham que adaptar-se rapidamente.

## Flexibilidade

Com os bancos de dados SQL, os dados são armazenados em uma estrutura predefinida muito mais rígida, mas com o NoSQL, os **dados podem ser armazenados de uma forma mais livre, sem esquemas rígidos**.

Este design permite **inovação e rápido desenvolvimento de aplicativos**. 

Os desenvolvedores podem se concentrar na **criação de sistemas para melhor atender seus clientes**, sem preocupar-se com os esquemas.

Os bancos de dados NoSQL **podem lidar facilmente com qualquer formato de dados**, como dados estruturados, semiestruturados, e não estruturados **em um único armazenamento de dados**.

## Escalabilidade

Em vez de escalar adicionando mais servidores, **os bancos de dados NoSQL podem escalar usando hardware comum**. Ao expandir, os bancos de dados NoSQL podem se tornar maiores e mais poderosos, e é por isso que eles se tornaram a opção preferida para conjuntos de dados em evolução.

## Alto desempenho

A arquitetura de expansão de um banco de dados NoSQL pode ser particularmente **valiosa quando o volume de dados ou tráfego aumenta**.

Essa arquitetura garante tempos de resposta rápidos e previsíveis em milissegundos de um dígito.

Os bancos de dados NoSQL também podem ingerir dados e entregá-los de forma rápida e confiável, e é por isso que os **bancos de dados NoSQL são usados em aplicativos que coletam terabytes de dados todos os dias**, ao mesmo tempo que exigem uma experiência do usuário altamente interativa.

## Disponibilidade

Os bancos de dados NoSQL **replicam dados automaticamente** em vários servidores, datacenters ou recursos de nuvem.

Por sua vez, isso **minimiza a latência para os usuários**, não importa onde eles estejam localizados. Esse recurso também reduz a carga de gerenciamento do banco de dados, o que libera tempo para concentrar-se em outras prioridades.