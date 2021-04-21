package study.memento;

public class MainTest {

    public static void main(String[] args) throws Exception {

        SunEnnianGamer sunEnnianGamer = new SunEnnianGamer();

        sunEnnianGamer.playGame();

        //第一次保存
        sunEnnianGamer.saveGameRecord();

        sunEnnianGamer.playGame();

        sunEnnianGamer.playGame();

        sunEnnianGamer.saveGameRecord();


        SunEnnianGamer fromMemento = sunEnnianGamer.getFromMemento(1);

        fromMemento.playGame();

    }

}
