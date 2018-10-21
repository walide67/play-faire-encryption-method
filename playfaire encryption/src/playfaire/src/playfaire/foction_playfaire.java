/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfaire;

/**
 *
 * @author walide
 */
public class foction_playfaire {

    public String correct_text(String s) {
        s = s.toLowerCase();//toLowerCase : traja3alna kamel l7orof minuscule
        s = s.replace('j', 'i');// remplaso kamel les j li rahom f text b i
        int j = 1;//j twali tapointer 3and 7arf zawaj inisializinaha b 1
        int i = 0;// i twali tapointer 3and 7arf lawal ininsializinaha b 0
        //bach nfar9o zoj 7orof matap3in ykono kifkif b x n9asmo alkalma ta3na l 2 parti lawal yabda men 0 7ata ll 7arf lawal w zawaj yabda yabda mn l7arf zawaj hata l la fin ta3a lkalma
        String part1;
        String part2;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)){
                part1 = s.substring(0, j);
                part2 = s.substring(j, s.length());
                s = part1 + "x" + part2;//hna hatina x bin les 2 alphapits
                System.out.println("part1="+part1);
                System.out.println("part2="+part2);
            }
            i = j + 1;//ida ka i=0 dork ywali 2 ya3ni l7arf 3eme
            j = i + 1;// i9ona =2 ya3ni j=3 w howa 7arfa 4eme
        }
        if (s.length() % 2 != 0) {// hadi bach nzido x f la fin ida kan 3adad al7orof fardi bach na9adro n9asmoha 2 par 2 w l7arf tali mayab9ach wa7do
            s = s + 'x';
        }
        return s;
    }

    public boolean char_exist(char c, char matrice[][]) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == c) {
                    return true;
                }
            }
        }

        return false;
    }

    public void manepulat_cle(char matrice[][], String cle) {
        char c;
        cle = cle.toLowerCase();// cli ntraj3oh minuscule 
        cle = cle.replace('j', 'i');// j li f cli remplasoha b i
        for (int k = 0; k < cle.length(); k++) {// bocliw cli 7arf b 7arf
            c = cle.charAt(k);// charAt treturni l7arf li landice nta3o k f cle
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (!char_exist(c, matrice) && matrice[i][j] == '\u0000') {
                        //ida carecter makanch kayan f matrice w caza li rana fiha vide n7otoh tama
                        matrice[i][j] = c;
                    }
                }
            }
        }
    }

    public void manupilate_alphapet(char matrice[][]) {
        String alphapet = "abcdefghiklmnopqrstuvwxyz";//String fiha kamel les alphabit a par j
        char c;
        int i, j;
        for (int k = 0; k < alphapet.length(); k++) {// nbocliw alphapet 7arf b 7arf 
            c = alphapet.charAt(k);// nado carecter li lindice nta3o k
            i = 0;
            while (i < matrice.length) {
                j = 0;
                while (j < matrice[i].length) {
                    if (!char_exist(c, matrice) && matrice[i][j] == '\u0000') {// \u0000: ma3naha character vide 
                        //ida al7arfa hada makach f matrice w caza li rana fiha vide ndiro had carecter f had alcaza
                        matrice[i][j] = c;
                    }
                    j++;
                }
                i++;
            }
        }
    }

    public String prem_cript(String s, char matrice[][]) {
        //hadi methode matadich alkalma compli tadi 2 7orof bark w takriptihom
        char prem_char = s.charAt(0);//7arf lawal
        char deux_char = s.charAt(1);//al7arf 2eme
        int i1 = 0, j1 = 0, i2 = 0, j2 = 0;//hado les indice ta3 l7orof
        for (int i = 0; i < matrice.length; i++) {//nbokliw f matrice ta3na hata le tali i tamchi 3la les lines 
            for (int j = 0; j < matrice[i].length; j++) {// j tbocli les colomnes 
                if (matrice[i][j] == prem_char) {//ki nsibo al7arf lawal nado i w j nta3o ch7al
                    i1 = i;
                    j1 = j;
                }
                if (matrice[i][j] == deux_char) {// ki nsibo al7arf 2eme nado i w j ntaw3o
                    i2 = i;
                    j2 = j;
                }
            }
        }
        //dork nabdaw natrito les cases li 3andna
        if (i1 == i2) {//ida kano fi nafss la line
            if (j1 < 4) {// ida makanch 7arf lawala f kaza talya ta3 la line nado 7arf li 3la la doit 
                prem_char = matrice[i1][j1 + 1];
            } else {// ida kan f casa talya ta3la line nado al7arf lawal men nafss la line 
                prem_char = matrice[i1][0];
            }
            if (j2 < 4) {// l7arf 2eme kifkif ida makanch f caza talya ta3 la line nado li 3la la doit 
                deux_char = matrice[i2][j2 + 1];
            }else {//ida kan f caza talya nado li rah lawal f nafss la line 
                deux_char = matrice[i2][0];
            }
        } else if (j1 == j2) {// ida kano f nafss colomn 
            if (i1 < 4) {//ida makanch l7arf 1er f kaza talya ta3 colomn nado li ta7to direct 
                prem_char = matrice[i1 + 1][j1];
            }else {//ida kan f casa talya nado al7arf lawal fi nafss la line yani fo9ani kamel bla manbadlo la line
                prem_char = matrice[0][j1];
            }
            if (i2 < 4) {//al7arf 2eme ida makanch f kaza talya ta3 colomn nado li rah ta7to direct
                deux_char = matrice[i2 + 1][j2];
            }else {//ida kan f kaza talya nado li rah lawal f nafss collomn
                deux_char = matrice[0][j2];
            }
        } else {//ida makanoch la fi nafss la line wala f nafsse colomn ko wa7ed yadi j nta3 lokher w nasan3o rectangle 
            prem_char = matrice[i1][j2];
            deux_char = matrice[i2][j1];
        }
//men ba3d n3awdo nrotorniw les deux carectre li criptinahom nlas9ohom m3a ba3dahom w naba3tohom 
        return prem_char + "" + deux_char;
    }
// decriptage kifkif m3a criptage na3aksso alkhadma bark
    public String prem_decript(String s, char matrice[][]) {
        char prem_char = s.charAt(0);
        char deux_char = s.charAt(1);
        int i1 = 0, j1 = 0, i2 = 0, j2 = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == prem_char) {
                    i1 = i;
                    j1 = j;
                }
                if (matrice[i][j] == deux_char) {
                    i2 = i;
                    j2 = j;
                }
            }
        }
        if (i1 == i2) {
            if (j1 > 0) {
                prem_char = matrice[i1][j1 - 1];
            } else {

                prem_char = matrice[i1][4];

            }
            if (j2 > 0) {
                deux_char = matrice[i2][j2 - 1];
            } else {

                deux_char = matrice[i2][4];

            }
        } else if (j1 == j2) {
            if (i1 > 0) {
                prem_char = matrice[i1 - 1][j1];
            } else {

                prem_char = matrice[4][j1];

            }
            if (i2 > 0) {
                deux_char = matrice[i2 - 1][j2];
            } else {
                deux_char = matrice[4][j2];

            }
        } else {
            
            prem_char = matrice[i1][j2];
            deux_char = matrice[i2][j1];
        }

        return prem_char + "" + deux_char;
    }
//hadi hiya methode li nakripto biha na3tolha b kalma w hiya ta3tina criptage nta3ha 
    public String crypter(String text, String cle) {
        String result = "";//initializo resulta b vide
        char matrice[][] = new char[5][5];// criyina matrice 5*5
        text = correct_text(text);//sagamna alkalma ta3na badelna j b i w zedna x ida kan lazem nzidoh
        manepulat_cle(matrice, cle);//3amarna cle f matrice
        manupilate_alphapet(matrice);//zadna 3amarna les alphapit
        for (int a = 0; a < matrice.length; a++) {
            for (int b = 0; b < matrice[a].length; b++) {
                System.out.print(matrice[a][b] + " ");//bach nafficho les lines ta3 matrice  f terminal nta3 netbeans
            }
            System.out.println();//kol mayakmal line lazem natkhataw line
        }
        int i = 0;
        int j = 1;
        String sub_text;//sub_text bach n3asmo alkalma ta3n l 2 7orof bark w n7otohom fih
        while (j < text.length()) {
            System.out.println(text);//nafichow f terminal text 9bal criptage
            sub_text = text.substring(i, j + 1);//substring tadi 2 parametre i index li nabdaw mano w j index li n7abso 3ando f kalma ta3na ... ya3ni na3toha kalma ta3tina parti manha
            result = result + prem_cript(sub_text, matrice);//men ba3d najam3o l7orof li kriptinahom mn 9bal b 2 7orof li zadna kriptinahom b methode prem_cript(premier criptage)
            i = j + 1;
            j = i + 1;
        }
        System.out.println("result=" + result);//nafficho resultat f terminal mora criptage 
        return result;//nterorniw resultat
    }
//dicriptage kifkif m3a criptage
    public String decrypter(String text, String cle) {
        String result = "";
        char matrice[][] = new char[5][5];
        text = correct_text(text);
        manepulat_cle(matrice, cle);
        manupilate_alphapet(matrice);
        for (int a = 0; a < matrice.length; a++) {
            for (int b = 0; b < matrice[a].length; b++) {
                System.out.print(matrice[a][b] + " ");
            }
            System.out.println();
        }
        int i = 0;
        int j = 1;
        String sub_text;
        while (j < text.length()) {
            System.out.println(text);
            sub_text = text.substring(i, j + 1);
            result = result + prem_decript(sub_text, matrice);
            i = j + 1;
            j = i + 1;
        }
        System.out.println("result=" + result);
        return result;
    }

    public static void main(String[] args) {
        foction_playfaire pf = new foction_playfaire();
        //String s = "MONARCHY";
        //String result;
        //char mtrc[][] = new char[5][5];
        //result = pf.decrypter("ibsupmnauz", s);
        //pf.manupilate_alphapet(mtrc);
        //String j = pf.correct_text(s);
        pf.correct_text("BALLOON");

    }

}
