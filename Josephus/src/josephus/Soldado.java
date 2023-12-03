package josephus;

import java.util.ArrayList;

public class Soldado {

    private ArrayList<Soldados> listaDeSoldado;

    public Soldado() {
        listaDeSoldado = new ArrayList<>();

        listaDeSoldado.add(new Soldados(1, "João", "(62)99937-8919", "235.164.951-02", "24968 Joaquim Marginal - Santa Luzia do Itanhy, AM / 16007-834"));
        listaDeSoldado.add(new Soldados(2, "Maria", "(64)99237-7119", "164.592.161-05", "76402 Oliveira Rodovia - Nova Bandeirantes, ES / 71707-952"));
        listaDeSoldado.add(new Soldados(3, "Pedro", "(62)99237-1951", "458.649.231-03", "65381 Henrique Rua - Presidente Epitácio, SP / 56790-881"));
        listaDeSoldado.add(new Soldados(4, "Francisco", "(63)99317-4914", "165.492.511-03", "4269 Alessandro Alameda - Nova Palmeira, RS / 94136-129"));
        listaDeSoldado.add(new Soldados(5, "Antônio", "(64)99237-8986", "462.258.761-21", "22441 Maitê Rua - Jacareacanga, MT / 80286-680"));
        listaDeSoldado.add(new Soldados(6, "Larissa", "(62)99237-1979", "912.264.521-06", "4870 Saraiva Alameda - Corbélia, MG / 62090-123"));
        listaDeSoldado.add(new Soldados(7, "Jorge", "(61)99337-2948", "654.594.621-04", "066 Melo Travessa - Alto Bela Vista, SE / 11890-736"));
        listaDeSoldado.add(new Soldados(8, "Rodrigues", "(65)99937-4319", "319.984.941-02", "947 Barros Marginal - Monte das Gameleiras, ES / 98916-340"));
        listaDeSoldado.add(new Soldados(9, "Lucas", "(61)99137-3212", "642.659.151-05", "959 Júlio Marginal - Riachão, TO / 91712-220"));
        listaDeSoldado.add(new Soldados(10, "José", "(63)99937-1311", "641.865.231-02", "1387 Carvalho Marginal - Itapejara d'Oeste, TO / 15349-832"));
        listaDeSoldado.add(new Soldados(11, "Ingrid", "(64)99337-1018", "614.954.531-02", "253 Macedo Rodovia - Brejo Grande do Araguaia, AL / 05576-891"));
        listaDeSoldado.add(new Soldados(12, "Marcela", "(62)99337-1117", "651.256.651-02", "61430 Lucas Alameda - Curionópolis, DF / 73133-195"));
        listaDeSoldado.add(new Soldados(13, "Gustavo", "(64)99237-2412", "359.261.852-05", "059 Víctor Rua - São José do Jacuípe, PA / 12786-835"));
        listaDeSoldado.add(new Soldados(14, "Manoel", "(63)99337-5617", "615.259.651-02", "68225 Costa Marginal - Porto Rico, AC / 17471-002"));
        listaDeSoldado.add(new Soldados(15, "Pereira", "(61)99237-7815", "465.645.541-05", "60229 Maria Júlia Rodovia - Santo Antônio do Aracanguá, MA / 48429-012"));
        listaDeSoldado.add(new Soldados(16, "Vinicius", "(65)99337-8913", "565.521.620-02", "408 Nogueira Avenida - Floriano Peixoto, PB / 53743-755"));
        listaDeSoldado.add(new Soldados(17, "Mateus", "(65)99237-1434", "326.052.651-05", "871 Marli Avenida - Frei Inocêncio, RR / 60810-104"));
        listaDeSoldado.add(new Soldados(18, "Cleiton", "(64)99437-1686", "521.351.569-05", "504 Xavier Alameda - Tarumirim, SP / 60964-131"));
        listaDeSoldado.add(new Soldados(19, "Cleumar", "(62)99337-3637", "234.512.659-02", "3523 Esther Marginal - Piraju, PR / 83232-507"));
        listaDeSoldado.add(new Soldados(20, "Rogério", "(61)99237-2717", "521.623.621-06", "0552 Lara Rodovia - Capim, RS / 24561-818"));
    }

    public ArrayList<Soldados> getListSoldado() {
        return listaDeSoldado;
    }

    public int localizarSoldado(int num) {
        int n = listaDeSoldado.size();
        int indice = 0;

        while (n > 1) {
            indice = (indice + num - 1) % n;
            listaDeSoldado.remove(indice);
            n--;
        }

        return listaDeSoldado.get(0).getNumero();
    }

    public class Soldados {

        int numero;
        String nome;
        String telefone;
        String cpf;
        String endereco;

        public Soldados(int numero, String nome, String telefone, String cpf, String endereco) {
            this.numero = numero;
            this.nome = nome;
            this.telefone = telefone;
            this.cpf = cpf;
            this.endereco = endereco;
        }

        public int getNumero() {
            return numero;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getCpf() {
            return cpf;
        }
    }
}
