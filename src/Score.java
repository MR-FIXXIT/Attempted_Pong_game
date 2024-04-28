import java.awt.*;

public class Score extends Rectangle{
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    Font newFont;

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        newFont = new CustomFont("bit5x3.ttf").createCustomFont();
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(newFont.deriveFont(Font.PLAIN, 60));
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        g.drawString(String.format("Riz : %02d", player1), (GAME_WIDTH/2)-240, 50);
        g.drawString(String.format("Bit : %02d", player2), (GAME_WIDTH/2)+20, 50);
    }


}
