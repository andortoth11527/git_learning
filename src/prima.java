public class prima {
    public static void main(String[] args) {

        //6. scrieti un array cu 5 string-uri. printati string-urile cu o lungime mai mare de 3 caractere.
        //7. scrieti un array cu 5 string-uri. printati string-urile cu o lungime mai mica de 5 caractere.
        //8. scrieti un array cu 5 string-uri. printati string-urile care incep cu o litera aleasa de voi
        //9. scrieti un array cu 5 string-uri. printati string-urile care incep cu o litera aleasa de voi sau cu alta litera aleasa de voi.
        //10. scrieti un array cu 5 string-uri. printati string-uri ecare incep cu o litera aleasa de voi si se termina cu alta litera aleasa de voi.


        String [] vectorul = {"unu", "doi", "trei", "patru", "cinci", "sase", "sapte", "opt", "noua", "zece"};


        System.out.println("-------------String > 3 caractere: --------------");
        for (int i = 0; i < vectorul.length; i++) {
            if( vectorul[i].length()>3){
                System.out.println(vectorul[i]);
            }
        }
        System.out.println("-------------String < 5 caractere: --------------");
        for (int i = 0; i < vectorul.length; i++) {
            if( vectorul[i].length()<5){
                System.out.println((vectorul[i].substring(0,1)));
            }
        }
        System.out.println("-------------String incepe cu literea s: --------------");
        for (int i = 0; i < vectorul.length; i++) {
            String primalitera=vectorul[i].substring(0,1);
            String ultimalitera;
            ultimalitera=vectorul[i].substring(vectorul[i].length() - 1);

            System.out.println(primalitera);
            if ( new String(primalitera).equals("z")  && new String(ultimalitera).equals("e"))
                System.out.println(vectorul[i]);
        }

    }

}
