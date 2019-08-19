package md.tekwill.demo.play;

class GameOfThrones {
    public static void main(String[] args) {
        //Winter is coming...
        NightKing nightKing = ChildrenOfTheForest.createNightKing();
        Dragon drogon = Daenerys.callADragon();

        while (nightKing.hasWhiteWalkers()) {
            drogon.breathFire();
            if (nightKing.isAlive())
                Arya.kill(nightKing);
        }
        int numberOfLikes = 999_999_999;
    }
}












