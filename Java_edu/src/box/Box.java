package box;

public class Box {
    private double width;
    private double height;
    private double length;

    //Все поля объявлены private, все конструкторы и методы public, в процессе программы нам не нужно менять значения
    //ширины, высоты и длины коробки, поэтому оставляем доступ только на чтение, для каждого поля создаем getter
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size){
        width=size;
        height=size;
        length=size;
    }

    public Box(){
        width=0;
        height=0;
        length=0;
    }

    public Box(Box box){
        this.width= box.width;
        this.length= box.length;
        this.height= box.height;
    }

    public void setDimens(double width, double height, double length){
        this.width=width;
        this.height=height;
        this.length=length;
    }

    public Box increase(int i){
        return new Box(width*i,height*i,length*i);
    }

    public double Volume(){
        return width*height*length;
    }

    public void showVolume(){
        System.out.println(Volume());
    }

    public int compare(Box box){
        double thisVolume=Volume();
        double boxVolume=box.Volume();
        int result;
        result = Double.compare(thisVolume, boxVolume);
        return result;
    }

    //homework15

    public Box sumBox(Box box){
        return new Box(this.width+ box.width,this.height+ box.height,this.length+ box.length);
    }

    public Box(Box box1, Box box2){
        this.width= box1.width+box2.width;
        this.length= box1.length+box2.length;
        this.height= box1.height+ box2.height;
    }

    public double getHeight() { return height; }

    public double getLength() { return length; }

    public double getWidth() {return width; }
}
