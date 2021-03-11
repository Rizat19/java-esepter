package test;

public class Rect {
    int width;
    int length;

    void setDimens(int width, int length){
        this.width=width;
        this.length=length;
    }

    int Perimetr(){
        return 2*(width+length);
    }

    int Area(){
        return width*length;
    }
}
