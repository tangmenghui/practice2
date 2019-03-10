package com.soft1841.pra.two;

interface  DrawImage {
    public void draw();
}
class Reatangle implements DrawImage{
    public void draw(){
        System.out.println("画矩形");
    }
}
class Square implements DrawImage{
    public void draw(){
        System.out.println("画正方形");
    }
}
class Diamond implements DrawImage{
    public void draw(){
        System.out.println("画菱形");
    }
}
class SpecialParallerlogram{
    public static void main(String[] args) {
        DrawImage[] images = {new Reatangle(),new Square(), new
                Diamond()};
        for(int i = 0; i < images.length; i++){
            images[i].draw();
        }
    }
}
