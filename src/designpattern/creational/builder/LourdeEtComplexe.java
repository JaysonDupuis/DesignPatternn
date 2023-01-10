package designpattern.creational.builder;

public class LourdeEtComplexe {
    //Beaucoup d'attributs
    private int premierAttribut;
    private String secondAttribut;
    private Boolean troisiemeAttribut;

    private LourdeEtComplexe(int premierAttribut, String secondAttribut, Boolean troisiemeAttribut) {
        this.premierAttribut = premierAttribut;
        this.secondAttribut = secondAttribut;
        this.troisiemeAttribut = troisiemeAttribut;
    }

    @Override
    public String toString() {
        return "LourdeEtComplexe{" +
                "premierAttribut=" + premierAttribut +
                ", secondAttribut='" + secondAttribut + '\'' +
                ", troisiemeAttribut=" + troisiemeAttribut +
                '}';
    }

    public static class Builder{
        private int premierAttribut;
        private String secondAttribut;
        private Boolean troisiemeAttribut;

        public Builder() {
        }

        public Builder setPremierAttribut(int premierAttribut) {
            this.premierAttribut = premierAttribut;
            return this;
        }

        public Builder setSecondAttribut(String secondAttribut) {
            this.secondAttribut = secondAttribut;
            return this;
        }

        public Builder setTroisiemeAttribut(Boolean troisiemeAttribut) {
            this.troisiemeAttribut = troisiemeAttribut;
            return this;
        }

        public LourdeEtComplexe build(){
             /**********************************\
              Verifier la validité des attributs
             \**********************************/

            return new LourdeEtComplexe(premierAttribut,
                    secondAttribut,
                    troisiemeAttribut);
        }
    }

}
