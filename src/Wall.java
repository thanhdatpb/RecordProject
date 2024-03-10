public class Wall {
    private double wight;
    private double height;

    public Wall(){

    }

    public Wall(double width, double height) {

        if (width < 0 || height < 0){
            width = 0;
            height = 0;
        }
        double width1 = width;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public double getHeight() {
        return height;
    }

    public void setWight(double wight) {
        if( wight < 0){
            wight = 0;
        }
        this.wight = wight;
    }


    public void setHeight(double height) {
        if(height < 0){
            height = 0;
        }
        this.height = height;

    }
    public double getArea(){
        return height * wight;
    }
}
