package md.tekwill.demo.methods.dice;

class DiceDemo {
    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        diceGame.printResults();
        diceGame.startPlaying(20);
        diceGame.printResults();
        diceGame.printResults();
        diceGame.printScores();
    }
}
