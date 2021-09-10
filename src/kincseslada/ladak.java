package kincseslada;

public class ladak {

    private String lada;
    private String felirat;
    private Boolean vaneKincs;

    public ladak(String lada, String felirat, Boolean vaneKincs) {
        this.lada = lada;
        this.felirat = felirat;
        this.vaneKincs = vaneKincs;
    }

    @Override
    public String toString() {
        return "Találtál kincset: " + vaneKincs;
    }
    
    
    

}
