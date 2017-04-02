//ROCK PAPER SCISSORS BY KEVIN KOVACK

import javax.swing.JOptionPane;

public class RPS
{

    public RPS()
    {
    }

    public static void main(String args[])
    {
        String s = "NOTHING";
        String s2 = "NOTHING";
        boolean flag = false;
        int j = 100;
        byte byte0 = 101;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        for(int i = JOptionPane.showConfirmDialog(null, "Would you like to play Rock, Paper, Scissors against me?", "Play RPS?", 0); i == 0; i = JOptionPane.showConfirmDialog(null, (new StringBuilder()).append("Wins:   ").append(l).append("\nLosses: ").append(i1).append("\nDraws:  ").append(j1).append("\n\nWould you like to play again?").toString(), "Play Again?", 0))
        {
            Object aobj[] = {
                "ROCK", "PAPER", "SCISSORS"
            };
            Object obj = JOptionPane.showInputDialog(null, "Choose ROCK, PAPER, or SCISSORS", "RPS", 1, null, aobj, aobj[0]);
            String s1 = (String)obj;
            int k = (int)(Math.random() * (double)j);
            if(k >= 0 && k <= 32)
            {
                s2 = "ROCK";
                if(s1.equals(s2))
                {
                    j1++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You and the Computer both threw ").append(s1).append("\nThe game ends in a draw.").toString());
                    continue;
                }
                if(s1.equals("PAPER"))
                {
                    l++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You threw ").append(s1).append(" and the Computer threw ").append(s2).append(".").append("\nYOU WIN!!!").toString());
                    continue;
                }
                if(s1.equals("SCISSORS"))
                {
                    i1++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You threw ").append(s1).append(" and the Computer threw ").append(s2).append(".").append("\nYOU LOSE.").toString());
                }
                continue;
            }
            if(k >= 33 && k <= 66)
            {
                s2 = "PAPER";
                if(s1.equals(s2))
                {
                    j1++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You and the Computer both threw ").append(s1).append("\nThe game ends in a draw.").toString());
                    continue;
                }
                if(s1.equals("SCISSORS"))
                {
                    l++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You threw ").append(s1).append(" and the Computer threw ").append(s2).append(".").append("\nYOU WIN!!!").toString());
                    continue;
                }
                if(s1.equals("ROCK"))
                {
                    i1++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You threw ").append(s1).append(" and the Computer threw ").append(s2).append(".").append("\nYOU LOSE.").toString());
                }
                continue;
            }
            if(k >= 67 && k <= 100)
            {
                s2 = "SCISSORS";
                if(s1.equals(s2))
                {
                    j1++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You and the Computer both threw ").append(s1).append("\nThe game ends in a draw.").toString());
                    continue;
                }
                if(s1.equals("ROCK"))
                {
                    l++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You threw ").append(s1).append(" and the Computer threw ").append(s2).append(".").append("\nYOU WIN!!!").toString());
                    continue;
                }
                if(s1.equals("PAPER"))
                {
                    i1++;
                    JOptionPane.showMessageDialog(null, (new StringBuilder()).append("You threw ").append(s1).append(" and the Computer threw ").append(s2).append(".").append("\nYOU LOSE.").toString());
                } else
                {
                    JOptionPane.showMessageDialog(null, "There was an error handling what was picked.");
                }
            } else
            {
                JOptionPane.showMessageDialog(null, (new StringBuilder()).append("Computer failed to chose and picked ").append(s2).append("!!!").toString());
            }
        }

    }
}