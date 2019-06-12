package pl.ml.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import lombok.Data;

import java.util.Random;

/**
 * @author pmatusiak
 */

@Data
public class RootViewController {

    @FXML
    public ImageView image;
    @FXML
    public Text text;
    @FXML
    public Button generate;

    private boolean gifFlag = false;

    private static final String[] firstMod = {"Ja chcę powiedzieć jedną rzecz: ",
            "Trzeba powiedzieć jedno: ",
            "Jak powiedział wybitny krakowianin Stanisław Lem, ",
            "Proszę mnie dobrze zrozumieć: ",
            "Ja chciałem państwu powiedzieć, że ",
            "Niech państwo nie mają złudzeń: ",
            "Powiedzmy to wyraźnie: "};

    private static final String[] secondMod = {"przedstawiciele czerwonej hołoty ",
            "ci wszyscy (tfu) geje ",
            "funkcjonariusze reżymowej telewizji ",
            "tak zwani ekolodzy ",
            " ci wszyscy (tfu) demokraci ",
            "agenci bezpieki ",
            "feminazistki "};

    private static final String[] thirdMod = {"zupełnie bezkarnie ",
            "całkowicie bezczelnie ",
            "o poglądach na lewo od komunizmu ",
            "celowo i świadomie ",
            "z premedytacją ",
            "od czasów Okrągłego Stołu ",
            "w ramach postępu "};

    private static final String[] fourthMod = {"nawołują do podniesienia podatków ",
            "próbują wyrzucić kierowców z miast ",
            "próbują skłócić Polskę z Rosją ",
            "głoszą brednię o globalnym ociepleniu ",
            "zakazują posiadania broni ",
            "nie dopuszczają prawicy do władzy ",
            "uczą dzuecu homoseksualizmu "};

    private static final String[] fifthMode = {"bo dzięki temu mogą kraść ",
            "bo dostają za to pieniądze ",
            "bo tak się uczy w państwowej szkole ",
            "bo bez tego (tfu!) demokracja nie może istnieć ",
            "bo głupich jest więcej niż mądrych ",
            "bo chcą tworzyć raj na ziemi ",
            "bo chcą niszczyć cywilizację białego człowieka "};

    private static final String[] sixthMod = {"przez kolejne kadencje.",
            "o czym się nie mówi.",
            "i właśnie dlatego Europa umiera.",
            "ale przyjadą muzułmanie i zrobią porządek.",
            "- tak samo zresztą jak za Hitlera.",
            "- proszę zobaczyć, co się dzieje na Zachodzie, jeśli mi państwo nie wierzą.",
            "co lat temu sto nikomu nie przyszłoby nawet do głowy."};

    public void generate() {
        while (!gifFlag){
            setGif();
        }

        Random random = new Random();
        int first = random.nextInt(firstMod.length - 1);
        int second = random.nextInt(secondMod.length - 1);
        int third = random.nextInt(thirdMod.length - 1);
        int fourth = random.nextInt(fourthMod.length - 1);
        int fifth = random.nextInt(fifthMode.length - 1);
        int sixth = random.nextInt(sixthMod.length - 1);

        text.setText(firstMod[first] + secondMod[second] + thirdMod[third] + fourthMod[fourth] + fifthMode[fifth] + sixthMod[sixth]);
    }

    private void setGif(){
        Image imageFromURL = new Image("https://thumbs.gfycat.com/PowerfulRareInchworm-size_restricted.gif");
        image.setImage(imageFromURL);
        gifFlag = true;
    }
}
