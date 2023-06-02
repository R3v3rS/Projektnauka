public class Player {
    private int idPlayer;
    private int pointsPlayer = 0;
    private static int players = 0;

    public Player() {
        this.idPlayer = players +1;
        players++;
    }

    public void setPointsPlayer(int pointsPlayer) {
        this.pointsPlayer = pointsPlayer;
    }
    public void addPointsPlayer() {
        this.pointsPlayer = pointsPlayer+1;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public int getPointsPlayer() {
        return pointsPlayer;
    }

    public static int getPlayers() {
        return players;
    }
}
