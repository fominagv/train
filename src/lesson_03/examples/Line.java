package lesson_03.examples;

/**
 * Created by galina on 3/9/16.
 */
//import lesson_03.examples.first.FirstClass;
import lesson_03.examples.second.OpenClass;
//import lesson_03.examples.second.PackageClass;

import java.awt.*;

class Line {
    public static void main(String[] args){
        System.out.println(new Point());     // lesson_03.examples.Point@60e53b93
        System.out.println(new Rectangle()); // java.awt.Rectangle[x=0,y=0,width=0,height=0]
       // FirstClass ас=new FirstClass(); //Ошибка компиляции
        OpenClass oc =new OpenClass();
    //    PackageClass pc =new PackageClass();
    }
}
