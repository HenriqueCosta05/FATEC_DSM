# Aula 01 - Ambiente virtual e Gerenciamento de Pacotes em Python


## Introdução aos ambientes virtuais
* Isolam as dependências dos projetos
* Permitem múltiplas versões da mesma biblioteca, sem conflitos.

## Gerenciamento de pacotes com `pip`
> [!IMPORTANT]
> pip: Gerenciador de pacotes padrão do python
* Facilita a instalação, atualização e remoção de pacotes.

## Criando e ativando um ambiente virtual 

* Criação:
```python
python -m venv fastapi_env
```

* Ativação:

```python
fastapi_env\Scripts\activate
```

* Com o ambiente ativado, temos de instalar as dependências:

```python
pip install fastapi uvicorn
```

* Além disso, salvaremos as dependências:
```python
pip freeze > requirements.txt
```

> [!IMPORTANT]
> Para recriar o ambiente virtual em outros locais, temos que realizar os procedimentos abaixo.

1. Copie `requirements.txt` para o novo ambiente.

2. Crie e ative um novo ambiente virtual.

3. Instale as dependências: `pip install -r requirements.txt`.

* Para executar o FastAPI:
`uvicorn main:app --reload`