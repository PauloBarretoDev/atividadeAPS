package Q1;
public class A { // a classe não possui nome
    private int x; // não é descrito do que se trata a variavel x

    public A(int p) { // construtor também não diz o que são as variaveis apenas seus tipos
        x = p;
    }

    public int m() { // o método não é descrito, esta apenas chamada por 'm' e não justifica o que ele faz
        return x * 2;
    }

    public void n(int newVal) { // o setter do método não é descrito como set
        x = newVal;
    }
}