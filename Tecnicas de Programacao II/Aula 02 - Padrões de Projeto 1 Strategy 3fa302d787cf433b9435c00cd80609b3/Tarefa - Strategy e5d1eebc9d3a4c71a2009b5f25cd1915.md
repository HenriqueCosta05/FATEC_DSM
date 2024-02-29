# Tarefa - Strategy

Escreva um programa que descubra o dia da semana e passe o controle para uma estratégia específica. A estratégia deve imprimir a mensagemDoDia() correspondente ao dia da semana.

Para descobrir o dia da semana crie um new GregorianCalendar() para obter a data corrente e use get(Calendar.DAY_OF_WEEK) para obter o dia da semana de 0 a 6.

# Resolução

Para iniciar o exercício, criei um projeto Java e, dentro dele, criei um diretório denominado `strategies`.

```java
package strategies;
```

Dentro deste diretório, criei a interface `Dia`, que funciona como um modelo de estratégia para as demais classes, que herdam o método `mensagemDoDia()`:

```java
package strategies;

public interface Dia {
    public void mensagemDoDia();
}
```

Agora,  criaremos o `contexto`, que executará o método void `mensagemDoDia()`, por meio do método `mostrarMensagem()`. Essa classe de contexto, denominada `Mensagem`, também será responsável por instanciar a classe GregorianCalendar, onde criaremos uma variável para armazenar o valor do dia atual e gerenciá-la através de um switch-case.

```java
import strategies.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mensagem {

    Dia msg;
    private GregorianCalendar calendar = new GregorianCalendar();
    int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

    public void mostrarMensagem() {
        switch (diaDaSemana) {
            case GregorianCalendar.SUNDAY:
                msg = new Domingo();
                msg.mensagemDoDia();
            case GregorianCalendar.MONDAY:
                msg = new Segunda();
                msg.mensagemDoDia();
            case GregorianCalendar.TUESDAY:
                msg = new Terca();
                msg.mensagemDoDia();
            case GregorianCalendar.WEDNESDAY:
                msg = new Quarta();
                msg.mensagemDoDia();
            case GregorianCalendar.THURSDAY:
                msg = new Quinta();
                msg.mensagemDoDia();
            case GregorianCalendar.FRIDAY:
                msg = new Sexta();
                msg.mensagemDoDia();
            case GregorianCalendar.SATURDAY:
                msg = new Sabado();
                msg.mensagemDoDia();

        }
    }
}
```

Criaremos, por fim, as **diferentes estratégias a serem empregadas** no nosso código. No caso, trata-se da criação de uma mensagem diferente para cada dia da semana:

```java
//Domingo.java
package strategies;

public class Domingo implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("Prepare-se para uma nova jornada. Que o domingo seja um dia de reflexão, planejamento e preparação para uma semana cheia de oportunidades e sucesso.");
    }
}

```

```java
//Segunda.java
package strategies;

public class Segunda implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("Novo começo, nova semana. Levante-se com determinação e comece a semana com entusiasmo. Suas conquistas esperam por você.");
    }
}

```

```java
//Terça.java
package strategies;

public class Terca implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("Meio da semana está chegando. Mantenha o foco e a determinação. Cada passo que você dá hoje te aproxima mais dos seus objetivos.");
    }
}

```

```java
//Quarta.java
package strategies;

public class Quarta implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("É hora de recarregar as energias. A semana está na metade, mas suas capacidades são infinitas. Continue perseverando!");
    }
}

```

```java
//Quinta.java
package strategies;

public class Quinta implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("Você já percorreu tanto esta semana. Não desista agora! Grandes coisas estão por vir se você continuar seguindo em frente.");
    }
}

```

```java
//Sexta.java
package strategies;

public class Sexta implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("Chegou o dia de celebrar suas conquistas! A semana pode ter sido desafiadora, mas você se mostrou mais forte. Continue brilhando.");
    }
}

```

```java
//Sábado.java
package strategies;

public class Sabado implements Dia {
    @Override
    public void mensagemDoDia() {
        System.out.println("Descanse, recarregue suas energias e faça o que te faz feliz. Este é o seu tempo para revitalizar sua mente e corpo para a próxima semana.");
    }
}

```

Por último. criaremos a classe principal e executável do nosso projeto:

```java
public class Principal {
    public static void main(String[] args) {
        Mensagem dia = new Mensagem();
        dia.mostrarMensagem();
    }
}

```