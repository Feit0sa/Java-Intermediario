public class Data {
    int dia, mes, ano;

    public String formatada() {
        if (isDataValida()) return dia + "/" + mes + "/" + ano;
        else return "Data Inválida";
    }

    // sim, com certeza tem uma forma muito melhor de fazer, mas não consegui pensar em nada
    private boolean isDataValida() {
        if (this.dia > 28 && this.mes == 2) return false;
        else if (this.dia > 31 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)) return false;
        else if (this.dia > 30 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) return false;
        else if (this.dia > 31) return false;
        else if (this.mes > 12) return false;
        return true; 
    }
}