package src.BogOpgaver;

public class ValutaOmregner {

    double nummer;

     double svenskeKroner(double nummer){
        this.nummer = nummer;
        double sOmregn = nummer * 1.55;
        return sOmregn;
    }
    double norskeKroner(double nummer){
        this.nummer = nummer;
        double sOmregn = nummer * 0.98;
        return sOmregn;
    }
    double finskeEuro(double nummer){
        this.nummer = nummer;
        double sOmregn = nummer * 11.53;
        return sOmregn;
    }
    double islandskeKroner(double nummer){
        this.nummer = nummer;
        double sOmregn = nummer * 0.079;
        return sOmregn;
    }
}
