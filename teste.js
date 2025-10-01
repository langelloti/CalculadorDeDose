class Caminhao{
    constructor(eixos, cor){
        this._eixos = eixos;
        this._cor = cor;
    }

    get eixos() {
        return this._eixos;
    }

    set eixos(value) {
        this._eixos = value;
    }

    get cor() {
        return this._cor;
    }

    set cor(value) {
        this._cor = value;
    }
}


private static void verificarNumerosPrimos(){
    System.out.println("Verificação de numeros primos");

    String sqlSelect = "SELECT (ID, NUMERO) FROM TABLEPRIMOS ORDER BY NUMERO";

    List<Integer> numerosPrimos = new ArrayList<>();
    int id, numero;

    try{
        ResultSet rs = stmt.executeQuery(sqlSelect);

        while(rs.next()){
            id = rs.getInt("ID");
            numero = rs.getInt("Numero");

            if (ehPrimo(numero)){
                numerosPrimos.add(numero);
            }
        }
    }
}