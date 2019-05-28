package com.greenfoxacademy.tennisgame;

public class TennisGame3 implements TennisGame {

  private int score1;
  private int score2;
  private String player1;
  private String player2;

  public TennisGame3(String player1, String player2) {
    this.player1 = player1;
    this.player2 = player2;
    this.score1 = 0;
    this.score2 = 0;
  }

  public String getScore() {
    String s;
    if (score2 < 4 && score1 < 4) {
      String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
      s = p[score2];
      return (score2 == score1) ? s + "-All" : s + "-" + p[score1];
    } else {
      if (score2 == score1)
        return "Deuce";
      s = score2 > score1 ? player1 : player2;
      return ((score2 - score1)*(score2 - score1) == 1) ? "Advantage " + s : "Win for " + s;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      this.score2 += 1;
    else
      this.score1 += 1;

  }
}