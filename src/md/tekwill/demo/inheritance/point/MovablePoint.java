package md.tekwill.demo.inheritance.point;

class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }


    public MovablePoint move() {
        moveUp();
        moveRight();
        return this;
    }

    public MovablePoint moveRight() {
        x += xSpeed;
        return this;
    }

    public MovablePoint moveLeft() {
        x -= xSpeed;
        return this;
    }

    public MovablePoint moveUp() {
        y += ySpeed;
        return this;
    }

    public MovablePoint moveDown() {
        y -= ySpeed;
        return this;
    }


}
