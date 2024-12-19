import java.util.ArrayList;
import java.util.List;

public class BaseBallteam {
    private List<Player> list=new ArrayList<>();
    private int wins=0,loss=0,ties=0;
    private String teamName;

    public BaseBallteam(String teamName) {
        this.teamName = teamName;
    }

}
