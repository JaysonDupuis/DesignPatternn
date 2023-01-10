package evolutionSwitch;

public class ProgrammePrincipal {
    public static void main(String[] args) {
        int discriminant=23;

        int v;

        switch (discriminant){
            case 5:{
                v=100;
            };break;
            case -15:{
                v=discriminant*12;
            };break;
            case 3:{
                v=3;
            };break;
            case 0:{
                v=0;
            };break;

            default: {v=-25;}
        }

        int w = switch (discriminant){
            case 5 -> 12;
            case 10 -> (2*discriminant);
            default -> -25;
        };

        int z = switch (discriminant){
            case 7 : {
                //
                //
                //
                yield 14;
            }
            case 45 : {
                //
                //
                //
                yield 5*discriminant;
            }

            default : {
                //
                yield 0;
            }
        };
    }
}
