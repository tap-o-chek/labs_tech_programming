package lab3;

import lab3.Chain.ChainServ;
import lab3.Iterator.TreasureChest;
import lab3.Strategy.StrategyServiceImpl;
import lab3.Strategy.SemicolonSeparated;
import lab3.Strategy.CommaSeparated;

import java.util.ArrayList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        System.out.println("Lab 3: Strategy: ");

        CommaSeparated comma_strat = new CommaSeparated();
        SemicolonSeparated semi_strat = new SemicolonSeparated();
        StrategyServiceImpl strat_serv = new StrategyServiceImpl(comma_strat);
        StrategyServiceImpl strat2_serv = new StrategyServiceImpl(semi_strat);

        List<String> list = new ArrayList<String>();
        list.add("bye");
        list.add("now it is mine");

        System.out.println("через \",\" :");
        System.out.println(strat_serv.exec(list));
        System.out.println("через \";\" :");
        System.out.println(strat2_serv.exec(list));



        System.out.println("\nLab 3: Chain: ");
        ChainServ chain_serv = new ChainServ();
        System.out.println(chain_serv.exec("session:path:method"));

        System.out.println("\nLab 3: Iterator: ");
        TreasureChest tr_chest = new TreasureChest();
        System.out.println(tr_chest.getItems());
    }
}
