package ec.edu.espe.practicalTestUnit3.control;

import java.util.ArrayList;

/**
 *
 * @author GUITARRA JHON, DEEE-ESPE
 */
public class SimbolSelect {

    public ArrayList<Integer> simbolSelect(String number) {
        ArrayList<Integer> list = new ArrayList();
        String[] txtComma = number.split(",");
        String[] txtSpace = number.split(" ");
        String[] txtPoinAnComma = number.split(";");
        String[] txtScript = number.split("-");
        String[] txtUnderScore = number.split("_");
        String[] txtTowPoint = number.split(":");
        String[] txtHashtag = number.split("#");
        String[] txtDollar = number.split("$");
        String[] txtPercentage = number.split("%");
        String[] txtAndGreek = number.split("&");
        String[] txtDivision = number.split("/");
        String[] txtEqual = number.split("=");

        int aux;
        if (txtComma.length > 1) {
            for (int i = 0; i < txtComma.length; i++) {
                aux = Integer.valueOf(txtComma[i]);
                list.add(aux);
            }
        } else if (txtSpace.length > 1) {
            for (int i = 0; i < txtSpace.length; i++) {
                aux = Integer.valueOf(txtSpace[i]);
                list.add(aux);
            }
        } else if (txtPoinAnComma.length > 1) {
            for (int i = 0; i < txtPoinAnComma.length; i++) {
                aux = Integer.valueOf(txtPoinAnComma[i]);
                list.add(aux);
            }
        } else if (txtScript.length > 1) {
            for (int i = 0; i < txtScript.length; i++) {
                aux = Integer.valueOf(txtScript[i]);
                list.add(aux);
            }
        } else if (txtUnderScore.length > 1) {
            for (int i = 0; i < txtUnderScore.length; i++) {
                aux = Integer.valueOf(txtUnderScore[i]);
                list.add(aux);
            }
        } else if (txtTowPoint.length > 1) {
            for (int i = 0; i < txtTowPoint.length; i++) {
                aux = Integer.valueOf(txtTowPoint[i]);
                list.add(aux);
            }
        } else if (txtHashtag.length > 1) {
            for (int i = 0; i < txtHashtag.length; i++) {
                aux = Integer.valueOf(txtHashtag[i]);
                list.add(aux);
            }
        } else if (txtDollar.length > 1) {
            for (int i = 0; i < txtDollar.length; i++) {
                aux = Integer.valueOf(txtDollar[i]);
                list.add(aux);
            }
        } else if (txtPercentage.length > 1) {
            for (int i = 0; i < txtPercentage.length; i++) {
                aux = Integer.valueOf(txtPercentage[i]);
                list.add(aux);
            }
        } else if (txtAndGreek.length > 1) {
            for (int i = 0; i < txtAndGreek.length; i++) {
                aux = Integer.valueOf(txtAndGreek[i]);
                list.add(aux);
            }
        } else if (txtDivision.length > 1) {
            for (int i = 0; i < txtDivision.length; i++) {
                aux = Integer.valueOf(txtDivision[i]);
                list.add(aux);
            }
        } else if (txtEqual.length > 1) {
            for (int i = 0; i < txtEqual.length; i++) {
                aux = Integer.valueOf(txtEqual[i]);
                list.add(aux);
            }
        }
        return list;
    }
}
