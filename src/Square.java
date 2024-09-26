class Square {
    public void area(int H,int W){
        System.out.print("Square area= "+ (H+W));
    }
    public void  area(double H,double W){
        System.out.print("SquareCircum area="+(2*H+2*W));
    }
    public static void main(String[] args){
        Square mySquare = new Square();

        mySquare.area(6,6);
        mySquare.area(6.6,6.9);
    }
}